/**
 * Clase que prueba la clase Dado
 *  
 */
public class DemoDado
{
    private Dado dado;
    private final int TOTAL = 30;
    /**
     * Constructor de la clase DemoDado
     */
    public DemoDado()
    {
        this.dado = new Dado();
    }

    /**
     * Lanzar el dado TOTAL veces contando
     * las apariciones del 1 y del 6
     *    
     */
    public void test1()
    {
        int res = 1;
        for(int i = 1; i <= TOTAL; i++){
            this.dado.tirarDado();
            System.out.println("Resultado " + res + ": " + this.dado.getCara());
            res++;
        }

                      
    }

    /**
     * Lanzar el dado hasta que salga
     * el 4 o 5 contando las veces que se lanzó
     *    
     */
    public void test2()
    {
        

    }

    /**
     * tirar el dado mientras la suma de las tiradas no supere el valor 42.
     */
    public void test3()
    {
        
    }

    

}
