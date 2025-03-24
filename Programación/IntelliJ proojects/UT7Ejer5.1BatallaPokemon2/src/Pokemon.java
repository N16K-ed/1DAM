abstract class Pokemon {
    protected String apodo;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int especial;
    protected int nivel;
    protected int exp;

    public Pokemon (String apodo){
        apodar(apodo);
        nivel = 1;
        exp = 0;
    }

    public void apodar(String apodo){
        this.apodo = apodo;
    }

    public abstract void atacar(Pokemon enemigo);
    public abstract void recibirAtaque(Pokemon agresor, int cantidadDano);
    public abstract double aplicarResistencia(Pokemon agresor);

    @Override
    public String toString(){
        return apodo + "\n--------------------\nNivel: " + nivel +
                        "\nPuntos de experiencia: " + exp + "\nPS: " + vida +
                        "\nAtaque: " + ataque + "\nDefensa: " + defensa +
                        "\nEspecial: " + especial + "\nVelocidad: " + velocidad;
    }
}
