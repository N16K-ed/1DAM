abstract class Pokemon {
    String apodo;
    int vida;
    int ataque;
    int defensa;
    int velocidad;
    int especial;
    int nivel;
    int exp;

    public Pokemon (String nombre, int vida, int ataque, int defensa, int especial, int velocidad){
        nivel = 1;
        exp = 0;
        apodo = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.especial = especial;
    }

    public Pokemon (){
        nivel = 1;
        exp = 0;
        apodo = "MissingNo";
        vida = 100;
        ataque = 50;
        defensa = 60;
        velocidad = 80;
        especial = 60;
    }

    public void apodar (String apodo){
        String antiguo = this.apodo;
        this.apodo = apodo;
        System.out.println("El Pokémon " + antiguo + " ha sido apodado " + this.apodo);
    }

    abstract int atacar(Pokemon enemigo);
    abstract void recibirAtaque(Pokemon agresor, int cantidadDano);

    @Override
    public  String toString() {
        return apodo + "\n********************\nNivel: " + nivel +
                "\nPuntos de Experiencia: " + exp + "\nPS: " + vida +
                "\nAtaque: " + ataque + "\nDefensa: " + defensa +
                "\nEspecial: " + especial + "\nVelocidad: " + velocidad;
    }
}
