
/**
 * Clase que modela un contador
 * 
 */
public class Contador
{
   
    private int valor;

    /**
     * Constructor  
     */
    public Contador() {
       valor = 0;
    }
    
     /**
     * Constructor  
     *  
     */
    public Contador(int valor)    {
        this.valor = valor;
    }
    
     /**
     * Accesor para el valor del contador
     * @return el valor del contador
     */
    public int getValor()    {
        return valor;
    }
    
    
     /**
     * Mutador para el valor del contador
     * @param valor el nuevo valor del contador
     */
    public void setValor(int valor)    {
        this.valor = valor;
    }
    
    
     /**
     * Mutador, incrementa en 1 el contador
     *  
     */
    public void incrementar()    {
        valor++;
    }
    
     /**
     * Mutador, decrementa en 1 el contador
     *  
     */
    public void decrementar()    {
            valor--;
    }
    
     
     /**
     * Mutador, pone a 0 el contador
     *  
     */
    public void reset()    {
            valor = 0;
    }
    
    
    
    
}
