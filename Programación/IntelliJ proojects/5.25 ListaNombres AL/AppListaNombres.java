import java.util.Arrays;

/**
 * 
 * Acepta como argumento del main el tama�o m�ximo de la lista
 * Si no se pasan argumentos se muestra un mensaje de error, se le informa al usuario
 * de la sintaxis a utilizar y se acaba el programa
 * 
 * En otro caso se crea la lista y:
 *  - se llama al m�todo cargarDeFichero() 
 *  - se muestra la lista
 *  - se muestra el nombre m�s largo
 *  - se borran los que empiezan por 'r'
 *  - se muestra la lista
 *  - se muestra cu�ntos empiezan por 'aL'
 *  - se muestran los nombres que empiezan por "a"
 */
public class AppListaNombres
{

    /**
     *  
     */
    public static void main(String[] args)
    {
       ListaNombres listaNueva = new ListaNombres(20);
       listaNueva.cargarDeFichero();
       listaNueva.printLista();
       System.out.println("El nombre m�s largo es " + listaNueva.nombreMasLargo() );
       listaNueva.borrarLetra('r');
       listaNueva.printLista();
       System.out.println(listaNueva.empiezanPor("aL"));
       System.out.println("Empiezan por 'a': \n" + Arrays.toString(listaNueva.empiezanPorLetra('a')));

        
        
    }
}
