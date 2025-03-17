public class Charmander extends Pokemon implements Fuego{

    public Charmander(){
        super("Charmander", 100, 50, 20, 55,30);
    }

    @Override
    int atacar(Pokemon enemigo) {
        System.out.println(apodo + " ha atacado a " + enemigo.apodo);
        if (enemigo.vida > 0){
            int dano;
            if (this.ataque - enemigo.defensa <= 0){
                dano = 1;
            }else{
                if ((this.ataque - enemigo.defensa) *
                        (this.velocidad / enemigo.velocidad) > 0
                        &&
                        (this.ataque - enemigo.defensa) * (this.velocidad / enemigo.velocidad) < 1){
                    dano = 1;

                }else{
                    dano = (this.ataque - enemigo.defensa) *
                            (this.velocidad / enemigo.velocidad);
                }

            }
            if (enemigo instanceof Planta){
                dano = dano * 2;
                System.out.println("¡Es muy eficaz!");
            }
            if (enemigo.vida - dano < 0){
                System.out.println(apodo + " ha debilitado a " + enemigo.apodo);
                return enemigo.vida;
            }
            return dano;
        }else{
            System.out.println("Pero " + enemigo.apodo + " ya está debilitado");
            return 0;
        }
    }

    @Override
    void recibirAtaque(Pokemon agresor, int cantidadDano) {
        int dano = cantidadDano;
        if (agresor instanceof Planta){
            dano = cantidadDano / aplicarResistencia();
        }
        this.vida = this.vida - dano;
        System.out.println(apodo + " ha perdido " + dano + " PS.");
    }

    @Override
    public int aplicarResistencia() {
        System.out.println("No es muy eficaz...");
        return 2;
    }
}
