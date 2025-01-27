public class Main {
    public static void main(String[] args) {
        Actividad actividad1 = new ActividadRio("1","Arga",2);
        Actividad actividad2 = new ActividadPolideportivo("2", "Polidepor", 2);
        Semana semana = new Semana(actividad1,actividad2,actividad1,actividad2,actividad1);
        Mes enero = new Mes("enero",semana,semana,semana,semana);
        System.out.println("Este es tu calendario: ");
        System.out.println(enero);
    }
}