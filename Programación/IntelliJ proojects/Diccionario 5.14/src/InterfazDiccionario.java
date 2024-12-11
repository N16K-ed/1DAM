
/**
 * clase InterfazDiccionario 
 *  
 */
import java.util.Scanner;
public class InterfazDiccionario
{
    private static final int AÑADIR = 1;
    private static final int MOSTRAR = 2;
    private static final int TRADUCIR = 3;
    private static final int SALIR = 4;

    private Scanner teclado;
    private Diccionario diccionario;

    /**
     * Constructor de objetos de la clase InterfazDiccionario
     * Crea e inicializa adecuadamente los atributos
     */
    public InterfazDiccionario(Diccionario diccionario)
    {
        // completar

    }

    /**
     * Incluye la lógica de la aplicación
     *  
     */
    public void iniciar()
    {
        borrarPantalla();
        int opcion = menu();
        while (opcion != SALIR){
            opcion = menu(); 
        }
    }

    /**
     * Presenta el menú - pide una opción y la valida
     * 
     * @return  la opción seleccionada ya validada
     */
    private int menu()
    {
        System.out.println("********************************");
        System.out.println("Gestión de un diccionario\n");
        System.out.println("********************************");
        System.out.println("1. Añadir palabra");
        System.out.println("2. Mostrar diccionario");
        System.out.println("3. Traducir palabra");
        System.out.println("4. Salir");
        System.out.print("Teclea opción: ");
        int opcion = teclado.nextInt();
        while (!opcionValida(opcion))    {
             System.out.print("Opción incorrecta, Teclea opción: ");
             opcion = teclado.nextInt();
        }
        return opcion;

    }

    /**
     *  Valida una opción recibida como parámetro
     *  Devuelve true si la opción es correcta, false en otro caso
     *   Sin if
     */
    private boolean opcionValida(int opcion)
    {
		return opcion >= AÑADIR && opcion <= SALIR;
    }

    /**
     * Añade una nueva palabra al diccioanrio
     */
    private void añadirPalabra()
    {
        borrarPantalla();
        teclado.nextLine(); //limpiar el buffer
        // completar

    }

    /**
     * Mostrar el diccioanrio
     */
    private void mostrarDiccionario()
    {
        borrarPantalla();
        // completar

    }

    /**
     * Traducir una  palabra al diccioanrio
     */
    private void traducirPalabra()
    {
        borrarPantalla();
        teclado.nextLine(); //limpiar el buffer
        // completar

    }

    /**
     * Borrar la pantalla
     */
    private void borrarPantalla()
    {
        System.out.println("\u000C");
    }

    
    
    
}
