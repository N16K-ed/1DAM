import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Bulbasaur bulba = new Bulbasaur();
        Charmander charm = new Charmander();
        Squirtle squirtle = new Squirtle();
        System.out.println("¿Quiéres ponerle un mote a " + bulba.apodo + "?(S/N)");
        String opcion = teclado.next();
        while (!(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N"))){
            System.out.print("Elige una opcion valida: ");
            opcion = teclado.next();
        }
        opcion = opcion.toUpperCase();
        switch (opcion){
            case "S":
                System.out.print("Introduce el nuevo mote: ");
                String nuevo = teclado.next();
                System.out.println("Se ha cambiado el mote de " + bulba.apodo + " a  " + nuevo);
                bulba.apodo = nuevo;
            case "N":
                System.out.println();
        }

        System.out.println("¿Quiéres ponerle un mote a " + charm.apodo + "?(S/N)");
        opcion = "";
        opcion = teclado.next();
        while (!(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N"))){
            System.out.print("Elige una opcion valida: ");
            opcion = teclado.next();
        }
        switch (opcion){
            case "S":
                System.out.print("Introduce el nuevo mote: ");
                String nuevo = teclado.next();
                System.out.println("Se ha cambiado el mote de " + charm.apodo + " a  " + nuevo);
                charm.apodo = nuevo;
            case "N":
                System.out.println();
                System.out.println();
        }

        System.out.println("¿Quiéres ponerle un mote a " + squirtle.apodo + "?(S/N)");
        opcion = "";
        opcion = teclado.next();
        while (!(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N"))){
            System.out.print("Elige una opcion valida: ");
            opcion = teclado.next();
        }
        switch (opcion){
            case "S":
                System.out.print("Introduce el nuevo mote: ");
                String nuevo = teclado.next();
                System.out.println("Se ha cambiado el mote de " + squirtle.apodo + " a  " + nuevo);
                squirtle.apodo = nuevo;
            case "N":
                System.out.println();
        }
        System.out.println("Pulse enter para comenzar la batalla");
        teclado.nextLine();

        System.out.println("\nDatos de los Pokémon");
        System.out.println("--------------------\n");

        System.out.println(bulba);

        System.out.println("\n--------------------\n");

        System.out.println(charm);

        System.out.println("\n--------------------\n");

        System.out.println(squirtle);

        System.out.println("\n--------------------\n");

        System.out.println("Pulse enter para continuar la batalla");
        teclado.nextLine();
        System.out.println("Turno 1:\n");
        charm.recibirAtaque(bulba, bulba.atacar(charm));
        squirtle.recibirAtaque(charm, charm.atacar(squirtle));
        bulba.recibirAtaque(squirtle, squirtle.atacar(bulba));

        System.out.println("\n====================================");
        System.out.println("\nDatos de los Pokémon");
        System.out.println("--------------------\n");

        System.out.println(bulba);

        System.out.println("\n--------------------\n");

        System.out.println(charm);

        System.out.println("\n--------------------\n");

        System.out.println(squirtle);

        System.out.println("\n--------------------\n");
        System.out.println("====================================");

        System.out.println("\nPulse enter para continuar la batalla");
        teclado.nextLine();


        System.out.println("\nTurno 2:\n");
        charm.recibirAtaque(squirtle, squirtle.atacar(charm));
        squirtle.recibirAtaque(bulba, bulba.atacar(squirtle));
        bulba.recibirAtaque(charm, charm.atacar(bulba));
        System.out.println("\n====================================");
        System.out.println("\nDatos de los Pokémon");
        System.out.println("--------------------\n");

        System.out.println(bulba);

        System.out.println("\n--------------------\n");

        System.out.println(charm);

        System.out.println("\n--------------------\n");

        System.out.println(squirtle);

        System.out.println("\n--------------------\n");
        System.out.println("====================================");
        System.out.println("\nPulse enter para continuar la batalla");
        teclado.nextLine();

        System.out.println("\nLos Pokémon han recuperado PS, pero están confusos debido al cansancio...");
        bulba.vida += 50;
        charm.vida += 50;
        squirtle.vida += 50;
        System.out.println("\n====================================");
        System.out.println("\nDatos de los Pokémon");
        System.out.println("--------------------\n");

        System.out.println(bulba);

        System.out.println("\n--------------------\n");

        System.out.println(charm);

        System.out.println("\n--------------------\n");

        System.out.println(squirtle);

        System.out.println("\n--------------------\n");
        System.out.println("====================================");
        System.out.println("\nPulse enter para continuar la batalla");
        teclado.nextLine();

        System.out.println("\nTurno 3:\n");
        System.out.println("¡¡Los Pokémon se están atacando a ellos mismos!!");
        charm.recibirAtaque(charm, charm.atacar(charm));
        squirtle.recibirAtaque(squirtle, squirtle.atacar(squirtle));
        bulba.recibirAtaque(bulba, bulba.atacar(bulba));
        System.out.println("\n====================================");
        System.out.println("\nDatos de los Pokémon");
        System.out.println("--------------------\n");

        System.out.println(bulba);

        System.out.println("\n--------------------\n");

        System.out.println(charm);

        System.out.println("\n--------------------\n");

        System.out.println(squirtle);

        System.out.println("\n--------------------\n");
        System.out.println("====================================");
    }
}