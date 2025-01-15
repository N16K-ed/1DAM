/**
 * Interfaz texto para interactuar con el usuario.
 * ------------------------------------------------
 * Un objeto de esta clase nos permitirá leer
 * valores para guardarlos en la clase
 * ArraySinRepetidos
 * 
 * @author  
 * @version  UT5 Ej.5.19
 */
import java.util.Scanner;
public class InterfazUsuario
{
    private ArraySinRepetidos unArray;
    private Scanner teclado;

    /**
     * Constructor  - crea e inicializa los atributos
     */
    public InterfazUsuario(){
        unArray = new ArraySinRepetidos();
        teclado = new Scanner(System.in);
    }

    /**
     * Permite pedir datos al usuario hasta introducir un 0
     * o hasta que el objeto unArray esté completo
     * Al final muestra el valor del array llamando al método printArray()
     */
    public void ejecutar()
    {
        for(int i = 0; i < 12; i++){
            System.out.println("Introduzca un número en la lista: ");
            unArray.insertar(teclado.nextInt());
        }
        /*int numeroDeLaSuerte = (int)(Math.random()*21);
        if(unArray.estaElemento(numeroDeLaSuerte)){ //Para probae el metodo estaElemento
            System.out.println("Número de la suerte: " + numeroDeLaSuerte + ".\n¡¡¡Has ganado la loteria!!!");
        }*/
        System.out.println(unArray);
        
        
                
    }
    
    /**
     * Muestra el array
     *  
     */
    private void printArray()
    {
        
    }
    
    
}
