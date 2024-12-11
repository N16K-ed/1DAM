public class Main {
    public static void main(String[] args) {
        Coche cocheA = new Coche ("Seat","Ibiza",114000,8500,2015);
        Coche cocheB = new Coche ("Audi","A3",105000,10200,2017);

        if (cocheA.kms > cocheB.kms){
            System.out.println(cocheA);
        }
        if (cocheB.kms > cocheA.kms){
            System.out.println(cocheB);
        }
        
        if (cocheA.precio > cocheB.precio){
            System.out.println(cocheA);
        }
        if (cocheB.precio > cocheA.precio){
            System.out.println(cocheB);
        }

        if (cocheA.anyo < cocheB.anyo){
            System.out.println(cocheA);
        }
        if (cocheB.anyo < cocheA.anyo){
            System.out.println(cocheB);
        }
        
        cocheB.Descuento(25);

        if (cocheA.precio > cocheB.precio){
            System.out.println(cocheA);
        }
        if (cocheB.precio > cocheA.precio){
            System.out.println(cocheB);
        }
        
        cocheB.aumentarKilometraje(10000);

        if (cocheA.kms > cocheB.kms){
            System.out.println(cocheA);
        }
        if (cocheB.kms > cocheA.kms){
            System.out.println(cocheB);
        }
    }
}