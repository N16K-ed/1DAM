public class Charmander extends Pokemon implements Fuego{
   public Charmander(String apodoC){
       super(apodoC);
       vida = 100;
       ataque = 10;
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
       //al no devolver un numero no se puede calcular el doble aqui, lo hago en aplicar resistencias al recibir un ataque
        int random = (int)(Math.random()*101);

        if(enemigo instanceof Planta){
            System.out.println("¡Es muy eficaz!");
        }
        if (random < 50){
            //se activa habilidad
            System.out.println("¡" + enemigo.apodo + " sufre de quemaduras!¡Ha perdido " + quemar(enemigo) + " PS!");
            enemigo.vida -= quemar(enemigo);
        }
    }

    @Override
    public double aplicarResistencia(Pokemon agresor) {
        if(agresor instanceof Planta){
            return 0.5;
        }else if (agresor instanceof Agua) {
            return 2;
        }else{
            return 1;
        }
    }

    @Override
    public int quemar(Pokemon agresor) {
        return agresor.vida * 8;
    }
}
