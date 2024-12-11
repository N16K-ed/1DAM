public class Empleado{
    String Nombre;
    String puesto;
    int sueldo;
    boolean disponibilidadViajar;

    void cambiarPuesto(String nuevoPuesto){
        puesto = nuevoPuesto;
    }

    void subidaSueldo(int porcentaje){
        sueldo = sueldo + sueldo * porcentaje / 100;
    }

    boolean mostrarDisponibilidadViajar(){
        return disponibilidadViajar;
    }

    void estaDisponible(){
        disponibilidadViajar = true;
    }

    void noEstaDisponible(){
        disponibilidadViajar = false;
    }
}


