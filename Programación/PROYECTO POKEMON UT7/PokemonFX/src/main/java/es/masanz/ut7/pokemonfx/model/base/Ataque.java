package es.masanz.ut7.pokemonfx.model.base;

import es.masanz.ut7.pokemonfx.model.enums.Tipo;

// TODO 13: Extender esta clase para crear vuestros propios ataques
public class Ataque {

    protected String nombre;
    protected int dmgBase;
    protected int precision;
    protected Tipo tipo;
    protected boolean esEspecial;
    protected int pp;
    protected int cantidad;
    protected int prioridad;
    protected int danofijo;

    public Ataque(String nombre, int dmgBase, int precision, Tipo tipo, boolean esEspecial, int cantidad, int prioridad) {
        this.nombre = nombre;
        this.dmgBase = dmgBase;
        this.precision = precision;
        this.tipo = tipo;
        this.esEspecial = esEspecial;
        this.pp = cantidad;
        this.cantidad = cantidad;
        this.prioridad = prioridad;
    }
    public Ataque(String nombre, int dmgBase, int precision, Tipo tipo, boolean esEspecial, int cantidad,int prioridad, int danofijo) {
        this.nombre = nombre;
        this.dmgBase = dmgBase;
        this.precision = precision;
        this.tipo = tipo;
        this.esEspecial = esEspecial;
        this.pp = cantidad;
        this.cantidad = cantidad;
        this.prioridad = prioridad;
        this.danofijo = danofijo;
    }

    public String ejecutarAtaque(Pokemon ejecutor, Pokemon destinatario) {
        StringBuilder sb = new StringBuilder();
        String nombrePokemonE = ejecutor.getApodo()!=null ? ejecutor.getApodo() : ejecutor.getClass().getSimpleName();
        sb.append(nombrePokemonE+" usó "+nombre+".");
        if(cantidad > 0){
            cantidad--;
            if (Math.random() * 100 < precision) {
                int dano = calcularDano(ejecutor, destinatario, sb);
                sb.append(" Hace "+dano+" puntos de daño.");
                destinatario.recibirAtaque(ejecutor, dano);
            } else {
                sb.append(" ¡Pero " + nombrePokemonE + " ha fallado el ataque!");
            }
        } else {
            sb.append(" ¡A "+nombrePokemonE+" no le quedan PP para realizar ese movimiento!");
        }
        return sb.toString();
    }

    // Formula REAL del juego de POKEMON
    protected int calcularDano(Pokemon ejecutor, Pokemon objetivo, StringBuilder sb) {
        int ataque = esEspecial ? ejecutor.getAtaqueEspecial() : ejecutor.getAtaque();
        int defensa = esEspecial ? objetivo.getDefensaEspecial() : objetivo.getDefensa();
        if(this.dmgBase == 0){
            return this.danofijo;
        }
        double danioBase = (((2.0 * ejecutor.getNivel() + 10) / 250.0) * (ataque / (double) defensa) * dmgBase + 2);
        // Aplicar STAB, es decir, el pokemon que ejecuta el ataque y el propio ataque son del mismo tipo
        Class<?>[] interfaces = ejecutor.getClass().getInterfaces();
        if(interfaces!=null && interfaces.length>0){
            for (Class<?> interfaceType : interfaces) {
                if(interfaceType.getSimpleName().equalsIgnoreCase(tipo.name())){
                    danioBase *= 1.5;
                }
            }
        }
        // Aplicar efectividad de tipo
        double efectividad = obtenerEfectividad(objetivo, sb);
        danioBase *= efectividad;
        // Aplicar golpe critico
        if (esGolpeCritico(ejecutor)) {
            sb.append("¡Un Golpe Crítico! ");
            danioBase *= 1.5;
        }
        // Aplicar variacion aleatoria
        double variacion = 0.85 + (Math.random() * 0.15);
        danioBase *= variacion;

        return (int) Math.max(1, danioBase);
    }

    protected boolean esGolpeCritico(Pokemon ejecutor) {
        double probabilidadCritico = 1.0 / 16.0;
        return Math.random() < probabilidadCritico;
    }

    protected double obtenerEfectividad(Pokemon objetivo, StringBuilder sb) {
        double multiplicador = 1.0;
        Class<?>[] interfaces = objetivo.getClass().getInterfaces();

        for (Class<?> interfaceType : interfaces) {
            String tipoDefensor = interfaceType.getSimpleName().toUpperCase();
            Tipo tipoDef = Tipo.valueOf(tipoDefensor);
            if (tipoDef.esInmuneA(this.tipo.name())) {
                sb.append(" Es inmune a ataques de tipo ").append(this.tipo.name().toLowerCase()).append("... ");
                return 0.0;
            }
            if (tipoDef.recibeDanoDeFormaDebil(this.tipo.name())) {
                multiplicador *= 2.0;
            } else if (tipoDef.recibeDanoDeFormaResistente(this.tipo.name())) {
                multiplicador *= 0.5;
            }
        }
        if (multiplicador == 0.5) {
            sb.append(" No es muy eficaz... ");
        } else if (multiplicador >= 2.0) {
            sb.append(" ¡Es super eficaz! ");
        }
        return multiplicador;
    }



    public String getNombre() {
        return nombre;
    }

    public int getDmgBase() {
        return dmgBase;
    }

    public int getPrecision() {
        return precision;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public boolean isEsEspecial() {
        return esEspecial;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPp() {
        return pp;
    }

    public int getCantidad() {
        return cantidad;
    }
}
