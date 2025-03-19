import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String apoCharm;
        String apoSqrt;
        String apoBulb;
        while (true) {
            try {
                System.out.println("Ponle un apodo a Charmander (1 a 12 caracteres alfanuméricos): ");
                apoCharm = teclado.next("[a-zA-Z0-9]{1,12}"); // Intenta leer la entrada
                break; // Si la entrada es válida, salimos del bucle
            } catch (InputMismatchException e) {
                System.out.println("Solo se permiten letras y números (1 a 12 caracteres)\n------------------------------------------------------\n------------------------------------------------------");
                teclado.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        }
        System.out.println("El apodo de Charmander ahora es: " + apoCharm);
        Charmander charm = new Charmander(apoCharm);

        System.out.println("-------------------------------------------------------------------------");

        while (true) {
            try {
                System.out.println("Ponle un apodo a Bulbasaur (1 a 12 caracteres alfanuméricos): ");
                apoBulb = teclado.next("[a-zA-Z0-9]{1,12}"); // Intenta leer la entrada
                break; // Si la entrada es válida, salimos del bucle
            } catch (InputMismatchException e) {
                System.out.println("Solo se permiten letras y números (1 a 12 caracteres)\n------------------------------------------------------\n------------------------------------------------------");
                teclado.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        }
        System.out.println("El apodo de Bulbasaur ahora es: " + apoBulb);
        Bulbasaur bulb = new Bulbasaur(apoBulb);

        System.out.println("-------------------------------------------------------------------------");

        while (true) {
            try {
                System.out.println("Ponle un apodo a Squirtle (1 a 12 caracteres alfanuméricos): ");
                apoSqrt = teclado.next("[a-zA-Z0-9]{1,12}"); // Intenta leer la entrada
                break; // Si la entrada es válida, salimos del bucle
            } catch (InputMismatchException e) {
                System.out.println("Solo se permiten letras y números (1 a 12 caracteres)\n------------------------------------------------------\n------------------------------------------------------");
                teclado.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        }
        System.out.println("El apodo de Squirtle ahora es: " + apoSqrt);
        Squirtle sqrtle = new Squirtle(apoSqrt);

        System.out.println("\nPulse enter para continuar...\n");
        teclado.nextLine();
        System.out.println("=====================");
        System.out.println("DATOS DE LOS POKÉMON:");
        System.out.println("---------------------");

        System.out.println(charm);

        System.out.println("---------------------");

        System.out.println(bulb);

        System.out.println("---------------------");

        System.out.println(sqrtle);

        System.out.println("---------------------");
        System.out.println("\nPulse enter para continuar...");
        teclado.nextLine();

        System.out.println("TURNO 1:");
        System.out.println("---------------------\n");

        bulb.recibirAtaque(charm, (charm.ataque-bulb.defensa) * (charm.velocidad / bulb.velocidad));
        charm.atacar(bulb);
        System.out.println();
        sqrtle.recibirAtaque(bulb, (bulb.ataque-sqrtle.defensa) * (bulb.velocidad / sqrtle.velocidad));
        bulb.atacar(sqrtle);
        System.out.println();
        charm.recibirAtaque(sqrtle, (sqrtle.ataque-charm.defensa) * (sqrtle.velocidad / charm.velocidad));
        sqrtle.atacar(charm);

        System.out.println("\nTURNO 2:");
        System.out.println("---------------------\n");

        bulb.recibirAtaque(charm, (charm.ataque-bulb.defensa) * (charm.velocidad / bulb.velocidad));
        charm.atacar(bulb);
        bulb.recibirAtaque(charm, (charm.ataque-bulb.defensa) * (charm.velocidad / bulb.velocidad));
        charm.atacar(bulb);
        bulb.recibirAtaque(charm, (charm.ataque-bulb.defensa) * (charm.velocidad / bulb.velocidad));
        charm.atacar(bulb);

        System.out.println("\nTURNO 3:");
        System.out.println("---------------------\n");

        sqrtle.recibirAtaque(charm, (charm.ataque-sqrtle.defensa) * (charm.velocidad / sqrtle.velocidad));
        charm.atacar(sqrtle);
        sqrtle.recibirAtaque(charm, (charm.ataque-sqrtle.defensa) * (charm.velocidad / sqrtle.velocidad));
        charm.atacar(sqrtle);
        sqrtle.recibirAtaque(charm, (charm.ataque-sqrtle.defensa) * (charm.velocidad / sqrtle.velocidad));
        charm.atacar(sqrtle);

        System.out.println("\nTURNO 3:");
        System.out.println("---------------------\n");

        sqrtle.recibirAtaque(bulb, (bulb.ataque-sqrtle.defensa) * (bulb.velocidad / sqrtle.velocidad));
        bulb.atacar(sqrtle);
        sqrtle.recibirAtaque(bulb, (bulb.ataque-sqrtle.defensa) * (bulb.velocidad / sqrtle.velocidad));
        bulb.atacar(sqrtle);
        sqrtle.recibirAtaque(bulb, (bulb.ataque-sqrtle.defensa) * (bulb.velocidad / sqrtle.velocidad));
        bulb.atacar(sqrtle);

        System.out.println("\nPulse enter para ver los resultados del combate...\n");
        teclado.nextLine();
        System.out.println("=====================");
        System.out.println("DATOS DE LOS POKÉMON:");
        System.out.println("---------------------");

        System.out.println(charm);

        System.out.println("---------------------");

        System.out.println(bulb);

        System.out.println("---------------------");

        System.out.println(sqrtle);

        System.out.println("---------------------");

    }
}