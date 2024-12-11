public class Alumno {
    public String nombre;
    public double notaProg;
    public double notaBada;
    public double notaEnde;
    public double notaSiin;

    public Alumno(String nombre, double notaProg, double notaBada, double notaEnde, double notaSiin){
        this.nombre = nombre;
        this.notaProg = notaProg;
        this.notaBada = notaBada;
        this.notaEnde = notaEnde;
        this.notaSiin = notaSiin;
    }


    public double calcularMedia(){
        double suma = this.notaProg + this.notaBada + this.notaEnde + this.notaSiin;
        return suma / 4;
    }

    public void cambiarNotaBada(double nuevaNotaBada){
        notaBada = nuevaNotaBada;
    }
}
