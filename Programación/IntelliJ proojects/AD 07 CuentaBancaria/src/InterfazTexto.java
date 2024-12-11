/**
 * Modela un interfaz de texto para interactuar con el usuario
 * 
 *  
 */
import java.util.Scanner;
public class InterfazTexto
{
    private final int INGRESO = 1;
    private final int REINTEGRO = 2;
    private final int CONSULTA = 3;
    private final int IMPRIMIR = 4;
    private final int SALIR = 5;

    private Cuenta cuenta;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazUsuario
     */
    public InterfazTexto()
    {
        teclado = new Scanner(System.in);
        cuenta = null;
    }

    /**
     * Controla la lógica del objeto InterfazTexto
     */
    public void iniciar()
    {
        borrarPantalla();
        System.out.println("Introduzca el nº de cuenta:");
        int numeroCuenta = teclado.nextInt();
        System.out.println("Introduzca el nombre del titular de la cuenta:");
        String titularCuenta = teclado.next();
        this.cuenta = new Cuenta(numeroCuenta, titularCuenta);
        int menu;
        boolean salir = false;
        while (!salir) {
            menu = menu();
            if (menu == INGRESO) {
                realizarIngreso();
            } else if (menu == REINTEGRO) {
                realizarReintegro();
            } else if (menu == CONSULTA) {
                consultarSaldo();
            } else if (menu == IMPRIMIR) {
                imprimirDatosCuenta();
            } else if (menu == SALIR) {
                salir = true;
            } else {
                System.out.println("Elija una opción válida");
            }
        }

    }

    /**
     *  pedir nº cuenta y devolverlo
     */
    private int leerNumeroCuenta()
    {
         
        return this.cuenta.getNumero();

    }
    
      /**
     *  pedir titular y devolverlo
     */
    private String leerTitular()
    {
        
        return this.cuenta.getTitular();

    }

    /**
     * pedir cantidad de ingreso e ingresar
     */
    private void realizarIngreso()
    {
        System.out.println("Introduzca cantidad a ingresar:");
        double ingreso = teclado.nextDouble();
        this.cuenta.ingresar(ingreso);

    }

    /**
     * pedir cantidad y reintegrar
     */
    private void realizarReintegro()
    {
        System.out.println("Introduzca cantidad a reintegrar:");
        int reintegro = teclado.nextInt();
        this.cuenta.reintegrar(reintegro);
    }

    /**
     * Mostrar saldo de la cuenta
     */
    private void consultarSaldo()
    {
        System.out.println("Saldo en la cuenta: " + this.cuenta.getSaldo());
    }

    /**
     * mostrar datos de la cuenta
     */
    private void imprimirDatosCuenta()
    {
        System.out.println("Datos de la cuenta: ");
        System.out.println(cuenta.toString());
    }

    /**
     * Presenta un menú en la pantalla
     * para que el usuario pueda elegir su opción
     * @return  devuelve la opción seleccionada
     */ 

    private int menu()
    {
        System.out.println(" ..........................................................");
        System.out.println(" Elige una opción ......");
        System.out.println(" ..........................................................");
        System.out.println(" 1.- Ingreso");
        System.out.println(" 2.- Reintegro");
        System.out.println(" 3.- Consulta saldo");
        System.out.println(" 4.- Imprimir datos cuenta");
        System.out.println(" 5.- Salir");
        System.out.println(" Teclea opción....");
        int opcion = teclado.nextInt();
        return opcion;
    }

    /**
     * Borrar la pantalla  
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }

}
