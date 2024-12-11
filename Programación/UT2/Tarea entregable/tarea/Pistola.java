public class Pistola {
    String Modelo;
    int numBalas;
    int numMaximoBalas;

    void Disparar(){
        numBalas = numBalas - 1;
    }

    void Recargar(){
        numBalas = numMaximoBalas;
    }

    int obtenerNumBalas(){
        return numBalas;
    }
}
