/**
 * Modela un libro que hay en una biblioteca
 * Todo libro tiene un título, un nº de páginas y un atributo
 * disponible que indica si está disponible o no (a true si lo está,
 * a false si no lo está)
 * 
 */
public class Libro
{     
   //TODO 

   
    /**
     * Constructor - crea un libro a partir del título y
     * las páginas indicadas como parámetros
     * Inicialmente todo libro está disponible
     */
     

    /**
     * accesor para el título
     */
   //TODO    

    /**
     * accesor para las páginas
     */
   //TODO 
   
   
    /**
     * accesor de nombre estaDisponible() 
     * para el atributo disponible
     */
    ////TODO 

    /**
     * devuelve true si el libro actual tiene más páginas que el recibido como parámetro
     */
    public  boolean masPaginasQue(Libro otro)    {
       //TODO 

    }

    /**
     * se presta un libro, éste deja de estar disponible
     */
    public void prestar()    {
        //TODO 
        
    }    

    /**
     * se devuelve un libro, vuelve a estar disponible
     */
    public void devolver()    {
       //TODO 
       
    }

    /**
     * Representación textual del libro
     *       Título: XXXXXXXXXX
     *      Páginas: XXX
     *   Disponible: XXX
     *   
     *   Dos columnas, 1ª columna ocupa 15 posiciones alineada a la derecha
     *                 2ª columna alineada a la izquierda
     */
    public  String toString()    {
        //TODO 
        return "";
    }

}
