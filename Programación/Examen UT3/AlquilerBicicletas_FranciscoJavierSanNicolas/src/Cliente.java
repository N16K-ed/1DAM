public class Cliente {
    private String nombre;
    private String dni;
    private boolean bicicletaAlquilada;
    private int numBicicletasAlquiladas;
    private int totalTiempo; //minutos
    private double totalPagado;
    private double pendientePago;
    private final double tarifaPrimerosMinutos = 0.60; //total hasta 20 min luego tarifaMinuto
    private final double tarifaMinuto = 0.15; //por minuto hasta 40 min luego tarifa40min
    private final double tarifa40min = 0.25; //por minuto

    public Cliente (String queNombre, String queDni){
        this.nombre = queNombre;
        this.dni = queDni;
        this.bicicletaAlquilada = false;
        this.numBicicletasAlquiladas = 0;
        this.totalTiempo = 0;
        this.totalPagado = 0;
        this.pendientePago = 0;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public boolean getBicicletaAlquilada() {
        return bicicletaAlquilada;
    }

    public int getNumBicicletasAlquiladas() {
        return numBicicletasAlquiladas;
    }

    public int getTotalTiempo() {
        return totalTiempo;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public double getPendientePago() {
        return pendientePago;
    }

    public double getTarifaPrimerosMinutos() {
        return tarifaPrimerosMinutos;
    }

    public double getTarifaMinuto() {
        return tarifaMinuto;
    }

    public double getTarifa40min() {
        return tarifa40min;
    }

    //Setters

    public void setBicicletaAlquilada(boolean nuevaBiciAlquilada){
        this.bicicletaAlquilada = nuevaBiciAlquilada;
    }

    public void setNumBicicletasAlquiladas(int nuevoNumeroBicis){
        this.numBicicletasAlquiladas = nuevoNumeroBicis;
    }

    public void setPendientePago(double nuevoPagoPendiente){
        this.pendientePago = nuevoPagoPendiente;
    }

    public void setTotalTiempo(int nuevosMinutos){
        this.totalTiempo = nuevosMinutos;
    }

    //Otros métodos

    public void recogerBicicleta(){
        if (this.bicicletaAlquilada){
            System.out.println("El clente ya tiene una Bicicleta alquilada");
        } else if (this.pendientePago != 0){
            System.out.println("El cliente tiene pagos pendientes");
        } else {
            this.bicicletaAlquilada = true;
            this.numBicicletasAlquiladas = this.numBicicletasAlquiladas + 1;
        }
    }

    private double calcularCosto(int totalTiempoDelViaje){
        double costo;
        if (totalTiempo <= 20){
            costo = this.tarifaPrimerosMinutos;
        } else if (totalTiempo <= 40){
            costo = this.tarifaPrimerosMinutos + (totalTiempoDelViaje - 20) * this.tarifaMinuto;
        } else {
            costo = this.tarifaPrimerosMinutos + (40 - 20) * this.tarifaMinuto + (totalTiempoDelViaje - 40) * tarifa40min;
        }
        return costo;
    }

    public void guardarBicicleta(int tiempoDelViaje){
        this.totalTiempo = this.totalTiempo + tiempoDelViaje;
        this.pendientePago = this.pendientePago + calcularCosto(tiempoDelViaje);
        bicicletaAlquilada = false;
    }

    public void pagarFactura(){
        this.pendientePago = 0;
    }

    public void mostrarTiempoTotal(){
        System.out.println("El cliente con DNI " + this.dni + " tiene un total de " + this.totalTiempo / 60 + " horas y " + this.totalTiempo % 60 + " minutos de tiempo total alquilado.");
    }

    public String nivelCliente(){
        String nivel;
        if (this.totalTiempo >= 60 && this.totalTiempo < 120){
            nivel = "Iniciado";
        } else if (this.totalTiempo >= 120 && this.totalTiempo < 180){
            nivel = "Avanzado";
        } else if (this.totalTiempo >= 180 && this.totalTiempo < 240){
            nivel = "Premium";
        } else if (this.totalTiempo >= 240){
            nivel = "Trotamundos";
        } else {
            nivel = "";
        }
        return nivel;
    }
}
