public class Pistola {
    String Modelo;
    int numBalas;
    int numMaximoBalas;

    void Disparar(){
        if (numBalas > 0) {
            numBalas = numBalas - 1;
        }
        else{
            System.out.println("No quedan balas");
        }
    }

    void Recargar(){
        numBalas = numMaximoBalas;
    }

    int obtenerNumBalas(){
        return numBalas;
    }
}
