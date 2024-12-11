public class Ordenador {
    String Marca;
    String Modelo;
    int Memoria;
    int MemLibre;
    int numSWInstalado;

    void InstalarSW(int GB){
        MemLibre = MemLibre - GB;
        numSWInstalado  = numSWInstalado + 1;
    }

    void Formatear(){
        numSWInstalado = 0;
        MemLibre = Memoria;
    }

    int obtenerMemLibre(){
        return MemLibre;
    }
}
