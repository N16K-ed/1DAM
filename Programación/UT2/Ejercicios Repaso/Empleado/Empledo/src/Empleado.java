public class Empleado{
    String Nombre;
    String puesto;
    int sueldo;
    boolean disponibilidad;

    void cambiarPuesto(String nuevoPuesto){
        puesto = nuevoPuesto;
    }

    void subidaSueldo(int porcentaje){
        sueldo = sueldo + sueldo * porcentaje / 100;
    }

    boolean mostrarDisponibilidadViajar(){
        return disponibilidad;
    }

    void estaDisponible(){
        disponibilidad = true;
    }

    void noEstaDisponible(){
        disponibilidad = false;
    }
}


