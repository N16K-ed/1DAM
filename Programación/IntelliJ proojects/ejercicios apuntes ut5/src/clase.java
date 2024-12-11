public class clase {
    private double[] precios;
    private boolean[] plazasParking;
    private String[] alumnos;
    private double[] lluviaNoviembreEnCiudad;
    private final int MAX = 25;

    public clase (int n){
       precios = new double[20];
       plazasParking = new boolean[n];
       alumnos = new String[MAX];
       lluviaNoviembreEnCiudad = new double[1]; //En noviembre meteríamos 30.
    }

    double lluvia = lluviaNoviembreEnCiudad[2]; //El array tiene posiciones pero no tiene valores.
    int n  = lluviaNoviembreEnCiudad.length; // n = numero de posiciones en el array


    int[] arrayConValores = {1,22,3,321,4114,64,1242,22,1};
    int numerillo = arrayConValores[5];


    //Ejercicio 5.3
    int[] diasMes = {31,29,31,30,31,30,31,31,30,31,30,31};
    int numeroElementos = diasMes.length;

    //Ejercicio 5.4
    public void escribirArray (){

        int[] arrayLocal ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i<10;i++){
            System.out.println(arrayLocal[i]);
        }

    }



}
