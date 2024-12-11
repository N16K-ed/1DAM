
/**
 * La clase principal que incluye el metodo main e 
 * inicia el proyecto
 * 
 */
public class AppSaludo
{
   
    /**
     * Punto de entrada a la aplicacion
     */
    
    public static void main(String[] args)
    {
        GeneradorSaludos generador = new GeneradorSaludos();
        generador.emitirSaludo();
    }

   
}
