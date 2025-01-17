/**
 * Un objeto de esta clase contiene una lista de números 
 * que no se repiten
 *  
 * @version UT5 Ej.5.19
 */
public class ArraySinRepetidos
{
    private static final int MAX = 10;
    private int[] elementos;
    private int siguiente;

    /**
     * Constructor 
     */
    public ArraySinRepetidos(){
        elementos = new int[MAX];
        siguiente = 0;
    }

      /**
     * Detecta si el array está completo
     * @return true si está completo

     */
    public boolean estaCompleto(){
        return siguiente >= elementos.length;
    }
    
    
    /**
     * Añade un nuevo valor al final del array si éste no está completo
     * y no está ya el elemento
     * 
     * @param nuevoElemento el valor a añadir

     */
    public void insertar(int nuevoElemento){
        if ((!estaElemento(nuevoElemento)) && !estaCompleto()) {
            elementos[siguiente] = nuevoElemento;
            siguiente++;
        } else if (estaCompleto()) {
            System.out.println("La lista de elementos está completa.");
        }else if (nuevoElemento == 0){

        }
        else{
            System.out.println("El elemento ya se encuentra registrado en la lista.");
        }
    }
    
      
    /**
     * Detecta si un valor está o no en el array
     * Se hace una búsqueda lineal
     * @param  numero el valor a buscar
     * @return   true si está el valor, false en otro caso
     */
    public boolean estaElemento(int numero){
        for (int i = 0; i < elementos.length; i++){
            if (numero == elementos[i]){
                return true;
            }
        }
        return false;
    }
     /**
     * Devuelve la representación textual del array de la forma {4, 6, 8, 13, 9}
     */
    public String toString(){
        String arrayToString = "";
        for (int i = 0; i < siguiente; i++){
            if(i == 0){
                arrayToString = arrayToString + elementos[0];
            }else{
                arrayToString = arrayToString + ", " + elementos[i] ;
            }
        }
        return ("Listado de elementos: {" + arrayToString +"}");
    }

}
