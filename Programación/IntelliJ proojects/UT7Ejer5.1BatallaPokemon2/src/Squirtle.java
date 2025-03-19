public class Squirtle extends Pokemon implements Agua{
    public Squirtle(String apoSqrt){
        super(apoSqrt);
        vida = 100;
        ataque = 12;
        defensa = 5;
        especial = 15;
        velocidad = 10;
    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        int random = (int)(Math.random()*101);
        double dano;
        if (agresor instanceof Fuego && random < 50){
            //se activa la habilidad
            System.out.println(agresor.apodo + " ha atacado a " + this.apodo + ".");
            dano = resistenciaAlFuego(agresor);
            if(aplicarResistencia(agresor) == 0.5){
                System.out.println("No es muy eficaz...");
            }
            System.out.println("¡" + apodo + " ha resistido el fuego y no ha recibido daño!");
            //no recibe daño
        }else{
            dano = (int) (cantidadDano * aplicarResistencia(agresor));
            System.out.println(agresor.apodo + " ha atacado a " + this.apodo + " causandole un daño de " + (int) dano + " PS.");
            if(aplicarResistencia(agresor) == 0.5){
                System.out.println("No es muy eficaz...");
            }
            vida -= (int) dano;
            //daño normal
        }
    }

    @Override
    public void atacar(Pokemon enemigo) {

        if(enemigo instanceof Fuego){
            System.out.println("¡Es muy eficaz!");
        }
    }

    @Override
    public double aplicarResistencia(Pokemon agresor) {
        if(agresor instanceof Fuego){
            return 0.5;
        }else if (agresor instanceof Planta) {
            return 2;
        }else{
            return 1;
        }
    }

    @Override
    public double resistenciaAlFuego(Pokemon agresor) {
        return 0;
    }
}
