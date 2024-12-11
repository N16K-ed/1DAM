public class Estudiante {
    String Nombre;
    char curso;
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

    char getCurso(){
        return curso;
    }
}
