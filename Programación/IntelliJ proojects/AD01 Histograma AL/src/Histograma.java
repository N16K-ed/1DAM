import java.util.Arrays;

/**
 * La clase contiene un array que se inicializa 
 * con una serie de valores y se utiliza para dibujar
 * un histograma
 */

public class Histograma
{
    private final static int MAX = 10;
    public final char ASTERISCO = '*';
    private int[] valores ;
    
    /**
     * Constructor
     */
    public Histograma()
    {
         this.valores = new int[MAX];
         inicializar();

    }

    /**
     * inicializa el array con valores aleatorios
     */
    private void inicializar()
    {
        for (int i = 0; i < MAX; i++){
            valores[i] = generarAleatorio();
        }

    }

    /**
     * genera y devuelve un aleatorio entre 5 y 50 inclusive
     */
    private int generarAleatorio()
    {
         return (int) (Math.random()*46 + 5);
    }

    /**
     *  muestra el histograma
     */
    public void escribirHistograma()
    {
         for (int i = 0; i < MAX; i++){
             for (int j = 0; j < valores[i]; j++){
                 System.out.print(ASTERISCO);
             }
             System.out.println();
         }
    }

 
    /**
     * 
     * devuelve una copia del array 
     */
    public int[] getValoresV1()
    {
        int[] copia = new int[MAX];
        System.arraycopy(valores, 0, copia, 0, MAX);
        // srcPos es la posicion en la que se empieza a copiar, destPos la posicion en la que se empiezan a pegar los valores copiados en el nuevo array.
        //fuciona así: (array_original, srcPos, array_nuevo, destPos, nº de valores que se copian del array original al nuevo)
        return copia;
    }

     /**
     * 
     * devuelve una copia del array 
     */
    public int[] getValoresV2()
    {
        return Arrays.copyOf(valores, MAX);
    }
       
}
