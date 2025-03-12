package Ejer2;

public class Main {
    public static void main(String[] args) {
        Camion camion1 = new Camion();
        Camion camion2 = new Camion("Dorado", "MatriculaDeHonor :3");
        Camion camion3 = new Camion("Negro","1234","Truck", 99999);
        System.out.println("Camión 1:\n" + camion1.toString() + "\nCamión 2:\n" + camion2 + "\nCamión 3:\n" + camion3);

    }
}