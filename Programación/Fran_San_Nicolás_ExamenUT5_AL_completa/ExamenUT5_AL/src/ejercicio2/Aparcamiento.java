package ejercicio2;

public class Aparcamiento {
    private Vehiculo[][] aparcamiento;
    int filas;
    int columnas;

    public Aparcamiento(int N, int M){
        filas = N;
        columnas = M;
        aparcamiento = new Vehiculo[N][M];
    }

    public void mostrarAparcamiento(){
        for (int i = 0; i < aparcamiento.length; i++){
            for (int j = 0; j < aparcamiento[i].length; j++){
                if (aparcamiento[i][j] == null){
                    System.out.print("LIBRE\t");
                }else{
                    System.out.println(aparcamiento[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }

    public String buscarPorMatricula(String matricula) {
        for (int i = 0; i < aparcamiento.length; i++) {
            for (int j = 0; j < aparcamiento[i].length; j++) {
                if (matricula.equals(aparcamiento[i][j].getMatricula())) {
                    return aparcamiento[i][j].getMatricula();
                }
            }
        }
        return "No se ha encontrado matrícula buscada";
    }

    public int contarPlazasLibres(){
        int contador = 0;
        for (int i = 0; i < aparcamiento.length; i++){
            for (int j = 0; j < aparcamiento[i].length; j++){
                if (aparcamiento[i][j] == null){
                    contador++;
                }
            }

        }
        return contador;
    }

    public void insertarVehiculo(Vehiculo vehiculo){
        if(contarPlazasLibres() != 0){
            boolean encontrado= false;
            while(!encontrado){
                for (int i = 0; i < aparcamiento.length; i++){
                    for (int j = 0; j < aparcamiento[i].length; j++){
                        if (aparcamiento[i][j] == null){
                            aparcamiento[i][j] = vehiculo;
                            encontrado= true;
                        }
                    }

                }
            }

        }
    }

    public void eliminarVehiculo(String matricula){
        for (int i = 0; i < aparcamiento.length; i++) {
            for (int j = 0; j < aparcamiento[i].length; j++) {
                if (matricula.equals(aparcamiento[i][j].getMatricula())) {
                    aparcamiento[i][j] = null;
                }
            }
        }
    }
    public void invertirHorizontal(){

    }

    public void invertirVertical(){
        int medio = (aparcamiento.length - 1)/2;
        for (int i = 0; i < ((aparcamiento.length-1) /2); i++) {
            Vehiculo[] temp = new Vehiculo[aparcamiento.length];
            temp = aparcamiento[aparcamiento.length-1-i];
            aparcamiento[aparcamiento.length-1-i] = aparcamiento[i];
            aparcamiento[i] = temp;
        }
    }


}
