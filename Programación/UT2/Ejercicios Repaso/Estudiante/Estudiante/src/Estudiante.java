public class Estudiante {
    String Nombre;
    int curso;
    double notaProg;
    double notaBada;
    double notaEnde;
    double notaSIIN;

    void calificarProg(double nuevaNotaProg){
        notaProg = nuevaNotaProg;
    }

    void calificarBada(double nuevaNotaBada){
        notaBada = nuevaNotaBada;
    }

    void calificarEnde(double nuevaNotaEnde){
        notaEnde = nuevaNotaEnde;
    }

    void calificarSIIN(double nuevaNotaSIIN){
        notaSIIN = nuevaNotaSIIN;
    }

    double notaMedia(){
        return (notaProg + notaBada + notaEnde + notaSIIN) / 4;
    }

    int getCurso(){
        return curso;
    }
}
