import java.util.Arrays;

/**
 *  Modela un grupo de alumnos de un curso
 */
public class Curso
{

    private static final int MAX_ALUMNOS = 10;

    private String nombreCurso;
    private Alumno[] alumnos;
    private int total;

    /**
     * Constructor de la clase Curso
     */
    public Curso(String nombreCurso)
    {
        this.nombreCurso = nombreCurso;
        alumnos = new Alumno[MAX_ALUMNOS];
        total = 0;
    }

    /**
     *   Añade un alumno al curso al final - Si el curso está completo se mostrará un mensaje    
     */
    public void addAlumno(String nombre, int nota)
    {
        if (total >= alumnos.length){
            System.out.println("El curso al que intentas añadir el alumno: " + nombre + " está completo.");
        }else {
            alumnos[total] = new Alumno(nombre, nota);
            total++;
        }
            
    }

    /**
     *    Añade un alumno al curso al final - Si el curso está completo se mostrará un mensaje  
     */
    public void addAlumno(Alumno alumno)
    {
        if (total >= alumnos.length){
            System.out.println("El curso al que intentas añadir el alumno está completo.");
        }else {
            alumnos[total] = alumno;
            total++;
        }
            
    }

    /**
     * devuelve la cantidad de aprobados en el curso
     */ 
    public int totalAprobados()
    { 
        int aprobados = 0;
        for (int i = 0; i < total; i++){
            if (alumnos[i].getNota() >= 5){
                aprobados++;
            }
        }
        return aprobados;
    }
    
    /**
     * devuelve un array de String con los nombres de los alumnos que han aprobado todo
     */ 
    public String[] alumnosConTodoAprobado()
    {
        int aprobados = 0;
        for (int i = 0; i < total; i++){
            if (alumnos[i].getNota() >= 5){
                aprobados++;
            }
        }
        String[] alumnosAprovados = new String[aprobados];
        int pos = 0;
        for (int i = 0; i < total; i++){
            if (alumnos[i].getNota() >= 5){
                alumnosAprovados[pos] = alumnos[i].getNombre();
                pos++;
            }
        } return alumnosAprovados;
    }

    /**
     * ordena el curso de mayor a menor nota por el método de selección directa (se modifica el array original)
     */
    public  void ordenarPorSeleccionDirecta()
    {
        for (int i = 0; i < alumnos.length; i++){
            for (int j = i+1; j < alumnos.length; i++){
                if ( alumnos[i] == null || alumnos[i].getNota() < alumnos[j].getNota() ){
                Alumno temp = alumnos[i];
                alumnos[i] = alumnos[j];
                alumnos[j] = temp;
                }
            }
        }
            
    }
    /**
     * Borrar los alumnos que han obtenido un 3 devolviendo la cantidad de alumnos borrados
     */
    public  int borrarLosDeNota3()
    {
        int total = 0;
        for (int i = 0; i < this.total; i++){
            if(alumnos[i].getNota() == 3){
                alumnos[i] = null;
                total++;
            }
        }
            this.total = this.total - total;
            ordenarPorSeleccionDirecta();
            return total;
    }
        
    /**
     * Representación textual del curso
     */
    public String toString()
    { 
        String tostr = "****************************************************\n";
        for (int i = 0; i < total; i++){
            tostr = tostr + "Alumno: " + alumnos[i].getNombre() + "\nNota: " + alumnos[i].getNota() + "\n****************************************************\n";
        }


        return tostr;
    }
    
  
    
     /**
     *  crea una copia del array alumnos
     *  Ordena la copia de menor a mayor nota por el método de inserción directa y lo devuelve.
     */
    public Alumno[] ordenarPorInsercionDirecta()
    {
       Alumno[] nuevoArray = Arrays.copyOf(alumnos, alumnos.length);

        for (int i = 0; i < nuevoArray.length; i++){
            for (int j = i+1; j < nuevoArray.length; i++){
                if (nuevoArray[i].getNota() < nuevoArray[j].getNota()){
                    Alumno temp = nuevoArray[i];
                    nuevoArray[i] = nuevoArray[j];
                    nuevoArray[j] = temp;
                }
            }
        }
       return nuevoArray;
    }
    
      
    /**
     *  obtiene un array con los nombres de los alumnos que han aprobado todo
     *  Ordena alfabéticamente ese  array usando un método de la clase Arrays
     */
    public String[] ordenarPorNombreAprobados()
    {
        String[] array = alumnosConTodoAprobado();
        Arrays.sort(array);
        return array;
    }
    
    

}
