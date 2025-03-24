public class Bulbasaur extends Pokemon implements Planta{
    public Bulbasaur(String apoBulb){
        super(apoBulb);
        vida = 100;
        ataque = 12;
        defensa = 5;
        especial = 16;
        velocidad = 10;
    }

    @Override
    public void recibirAtaque(Pokemon agresor, int cantidadDano) {
        cantidadDano = (int) (cantidadDano * aplicarResistencia(agresor));
        System.out.println(agresor.apodo + " ha atacado a " + this.apodo + " causandole un daño de " + cantidadDano + " PS.");
        if(aplicarResistencia(agresor) == 0.5){
            System.out.println("No es muy eficaz...");
        }
        vida -= cantidadDano;
    }

    @Override
    public void atacar(Pokemon enemigo) {
        int random = (int)(Math.random()*101);
        if(enemigo instanceof Agua){
            System.out.println("¡Es muy eficaz!");
        }
        if (random < 50){
            //se activa habilidad
            System.out.println("¡" + apodo + " ha recuperado algo de vida! (+ " + recuperarVida() +" PS.)" );
            vida += recuperarVida();
        }
    }

    @Override
    public double aplicarResistencia(Pokemon agresor) {
        if(agresor instanceof Agua){
            return 0.5;
        }else if (agresor instanceof Fuego) {
            return 2;
        }else{
            return 1;
        }
    }

    @Override
    public int recuperarVida() {
        return especial / 3;
    }
}
