
/**
 *  la clase Diccionario representa a un diccionario
 *  de palabras
 * 
 */

public class Diccionario
{
    private static final int MAX_PALABRAS = 10;
    private Palabra[] listaPalabras;
    private int pos;

    /**
     * Constructor de la clase Diccionario
     * @param numPalabras la cantidad de palabras máxima
     * que guardará el diccionario
     */
    public Diccionario(int numPalabras)
    {
        if (numPalabras > MAX_PALABRAS){
            this.listaPalabras = new Palabra[MAX_PALABRAS];
        }else{
            this.listaPalabras = new Palabra[numPalabras];
        }
    }

    /**
     * 
     * @param palabra la palabra a añadir     
     */
    public void insertarPalabra(Palabra palabra)
    {

    }
    /**
     * @param posicion la posición de la palabra
     *        a devolver. A partir de 1.
     * @return la palabra de posicion
     */
    public Palabra obtenerPalabra(int posicion)
    {
        return null;
    }

    /**
     * @param posicion la posición de la palabra
     *        a traducir. A partir de 1.
     * @return la traducción al inglés de la palabra
     *          de posición 
     */
    public String traducirPalabra(int posicion)
    {
        return null;
    }

    /**
     * Mostrar el diccionario
     */
    public void escribirDiccionario()
    {
        System.out.println(toString());
    }

    /**
     * Representación textual del diccionario
     */
    public String toString()
    {

            return null;
    }

}
