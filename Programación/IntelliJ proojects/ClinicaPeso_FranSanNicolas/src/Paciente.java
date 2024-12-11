public class Paciente {
//Atributos de la clase
    private final int tarifaEstandar = 50; //Es el importe por sesión que se cobra al paciente si tuviera contratada la tarifa estándar en €. Es constante y su valor es de 50€.
    private final int tarifaPlus = 75; //Es el importe por sesión que se cobra al paciente si tuviera contratada la tarifa Plus en €. Es constante y su valor es de 75€.


    private String nombre; //Nombre de los pacientes
    private double altura; //Altura en metros de los pacientes
    private double peso; //Peso en kg de los pacientes
    private int tiempoTotalSesiones; //Se guarda el total de tiempo pasado en todas las sesiones EN MINUTOS.
    private int sesionesDisponibles; //Número de sesiones que se pueden realizar (Ya compradas)
    private boolean tieneTarifaPlus; //Indica si tiene tarifa plus (true) o no (false).
    private double yaPagado; // Registra la cantidad YA PAGADA (Se actualiza al comprar las sesiones.

//Constructor. Tiene 3 parámetros de entrada formales. Los demas atributos especificaremos dentro del constructor como se inicializan.
    public Paciente(String queNombre, double queAltura, double quePeso) {
        nombre = queNombre;
        altura = queAltura;
        peso = quePeso;
        tiempoTotalSesiones = 0;
        sesionesDisponibles = 0;
        tieneTarifaPlus = false;
        yaPagado = 0;
    }

//Métodos accesores y mutadores.
    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getTiempoTotalSesiones() {
        return tiempoTotalSesiones;
    }

    public int getSesionesDisponibles(){
        return sesionesDisponibles;
    }

    public boolean getTieneTarifaPlus(){
        return tieneTarifaPlus;
    }

    public double getYaPagado(){
        return yaPagado;
    }

    public void setPeso(double quePeso){
        peso = quePeso;
    }
 //Fin de métodos accesores y mutadores.

    public double calculaIMC(){  //Calcula el IMC.
        double IMC;
        IMC = peso/Math.pow(altura,2);
        return IMC;
    }
//Se utiliza el calculo del metodo calculaIMC() para mostrar las indicaciones correspondientes a los rangos dados en el enunciado.
//Warning por usar una tilde en el nombre. Lo dejo así porque así esta puesto en el enunciado del ejercicio.
    public void mostrarRecomendación(){
        if (calculaIMC() < 20){
            System.out.println("Usted está en delgadez, debería comer grasas y entrenamiento de fuerza para aumentar peso.");
        } else if (calculaIMC() >=20 && calculaIMC() <25){
            System.out.println("Usted se encuentra en estado óptimo; siga así.");
        } else if (calculaIMC() >=25 && calculaIMC() <30){
            System.out.println("Usted se encuentra en pre-obesidad. Deberá seguir una dieta basada en proteínas y ejercicio de cardio tres veces por semana.");
        } else {
            System.out.println("Usted se encuentra en obesidad. Por favor, contacte con nuestro endocrino lo antes posible, su salud corre peligro.");
        }
    }
// Calcula el peso ideal del paciente (Caso en el que el IMC es 22,5). Se obtiene la fórmula utilizando la fórmula del cálculo del IMC
    public double calcularPesoIdeal(){
        return 22.5 * Math.pow(altura,2);
    }

    public void cambiarTarifa(){
        tieneTarifaPlus = !tieneTarifaPlus;
    }

//Se actualiza yaPagado multiplicando las sesiones que has comprado (máximo 10) por el valor de la sesión segun la tarifa que tengas.
//Al comprar sesiones se añaden las sesiones compradas a las disponibles (como máximo se añadirán 10).
    public void comprarSesiones(int nuevasSesiones){
        if ( nuevasSesiones < 10){
            sesionesDisponibles = sesionesDisponibles + nuevasSesiones;
            if (tieneTarifaPlus){
                yaPagado = yaPagado + tarifaPlus * nuevasSesiones;
            } else {
                yaPagado = yaPagado + tarifaEstandar * nuevasSesiones;
            }
        } else {
            sesionesDisponibles = sesionesDisponibles + 10;
            if (tieneTarifaPlus){
                yaPagado = yaPagado + tarifaPlus * 10;
            } else {
                yaPagado = yaPagado + tarifaEstandar * 10;
            }
        }

    }

//Solo se pueden realizar sesiones entre las horas 8:00 y 21:00. (Minutos restringidos: solo son posibles de 0 a 59).
//Si se intenta realizar una sesión fuera del horario se imprimirá por consola que NO HAY SESIONES DISPONIBLES.
    public void realizarSesion(int horaInicio, int minutosInicio, int horaFinal, int minutosFinal){
        if (horaInicio >= 8 && minutosInicio < 60 && minutosInicio >= 0 && horaFinal < 21 && minutosFinal <60 && minutosFinal >=0 && sesionesDisponibles > 0) {
            int horasTotales = horaFinal - horaInicio;
            int minutosTotales = minutosFinal - minutosInicio;
            tiempoTotalSesiones = tiempoTotalSesiones + ((horasTotales * 60) + minutosTotales);
            sesionesDisponibles = sesionesDisponibles - 1;

        } else {
            System.out.println("NO HAY SESIONES DISPONIBLES");
        }
    }

//Como el tiempoTotalSesiones esta guardado en minutos, para separarlo por horas y minutos: dividimos tiempoTotalSesiones entre sesenta para saber las horas y el resto de esa misma división seran los minutos.
    public void imprimirTiempoTotalSesiones() {
        System.out.println("El paciente " + nombre + " lleva " + tiempoTotalSesiones / 60 + " horas " + (tiempoTotalSesiones % 60) + " minutos ");
    }

}
