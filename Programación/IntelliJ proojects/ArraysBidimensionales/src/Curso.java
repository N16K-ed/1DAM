import com.sun.security.jgss.GSSUtil;

public class Curso {
    private static final int MAX_ESTUDIANTES = 20;
    private static final int MAX_ASIGNATURAS = 6;
    private int[][] notas;

    public Curso(){
        notas = new int[MAX_ESTUDIANTES][MAX_ASIGNATURAS];
        inicializar();
    }
    public void inicializar(){
        for (int x = 0; x < notas[MAX_ASIGNATURAS].length; x++){ //recorre las columnas: 1 columna --> todas las filas (en bucle)
            for (int y = 0; y < notas.length; y++){ //Recorre las filas (Estudiantes)
                notas[y][x] = (int) (Math.random()* 10 +1);
            }
        }
    }//Este método va rellenando el array bidimensional por columnas.

    public void imprimirNotas(){
        System.out.print("Asignaturas  :   ");
        for (int asig = 0; asig < MAX_ASIGNATURAS; asig++){
            System.out.print("Asig" + asig + " ");
        }
        System.out.print("   |  Nota Media del Estudiante:  |");
        System.out.println("\n--------------------------------------------------------|------------------------------|");// Imprime la cabecera de la tabla
        for (int y = 0; y < notas.length; y++){
            if (String.valueOf(y+1).length() == 1){//If para ajustar los espacios de la tabla
                System.out.print("Estudiante  " + (y+1) + ":      "); //Imprime el estudiante con el numero
            }else{
                System.out.print("Estudiante " + (y+1) + ":      ");
            }
            for (int x = 0; x < notas[MAX_ASIGNATURAS].length; x++){
                if (String.valueOf(notas[y][x]).length() == 1){//If para ajustar los espacios de la tabla
                    System.out.print(" " + notas[y][x] + "    "); //Imprime las notas de cada asignatura
                }else{
                    System.out.print(notas[y][x] + "    ");
                }
            }
            System.out.print("|  ");
            if (String.valueOf(y+1).length() == 1){ //If para ajustar los espacios de la tabla
                System.out.print("Estudiante  " + (y+1) + ":      ");//Imprime el estudiante con el numero, paralas medias de cada estudiante
            }else{
                System.out.print("Estudiante " + (y+1) + ":      ");
            }
            if (String.valueOf(calcularMediasEstudiantes()[y]).length() == 3){ //If para ajustar los espacios de la tabla
                System.out.print("   " + calcularMediasEstudiantes()[y]+ "  |"); //Imprime las medias de cada estudiante
            }else{
                System.out.print("  ");
                System.out.printf("%.2f",calcularMediasEstudiantes()[y]); // Da formato a los doubles de usar solo 2 decimales
                System.out.print("  |");
            }

            System.out.println();
        }
        System.out.println("--------------------------------------------------------|------------------------------|");
        System.out.print("Media Asignatura: ");
        for (int medias = 0; medias < calcularMedias().length; medias++){
            if (String.valueOf(calcularMedias()[medias]).length() == 3){ //If para ajustar los espacios de la tabla
                System.out.print(" " + calcularMedias()[medias]+ "  "); //Imprime medias por asignatura
            }else{
                System.out.print(calcularMedias()[medias]+ "  ");
            }

        }
        System.out.print("  |XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|"); // no hay nota media de la asignatura: Media de cada estudiante (obviamente), imprime XXXXX para marcar que esta vacio y hacer bonito :P
    }

    public double[] calcularMedias(){ //Calcular la media por casa asignatura
        double[] listadoMedias = new double[MAX_ASIGNATURAS]; //crea el array para la media de cada asignatura
        for (int x = 0; x < notas[MAX_ASIGNATURAS].length; x++){
            double media = 0; //inicializa a 0 la suma de la media (aunque se llame media es una suma) cada vez que se cambia de asignatura/columna.
            for (int y = 0; y < notas.length; y++){
                media = media + notas[y][x]; //suma todas las notas
            }
            listadoMedias[x] = media /  MAX_ESTUDIANTES; //hace la media dividiendo
        }
        return listadoMedias;
    }

    private double[] calcularMediasEstudiantes(){
        double[] listadoMedias = new double[MAX_ESTUDIANTES]; //crea el array para la media de cada Estudiante
        for (int y = 0; y < notas.length; y++){
            double suma = 0;//inicializa a 0 la suma de la media (aunque se llame media es una suma) cada vez que se cambia de Estudiante/fila.
            for (int x = 0; x < notas[MAX_ASIGNATURAS].length; x++){
                suma = suma + notas[y][x];//suma todas las notas
            }
            listadoMedias[y] = suma / MAX_ASIGNATURAS;//hace la media dividiendo
        }
        return listadoMedias;
    }


    public int[][] getNotasCurso(){
        return notas;
    }
}
