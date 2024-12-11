public class Cliente {
    private String nombre;
    private String dni;
    private boolean cocheAlquilado;
    private int diasAlquiler;
    private final int tarifaDiaria = 40;
    private int pendientePago;

    public Cliente(String queNombre, String queDni) {
        this.nombre = queNombre;
        this.dni = queDni;
        cocheAlquilado = false;
        diasAlquiler = 0;
        pendientePago = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public boolean getCoheAlquilado() {
        return cocheAlquilado;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public int getTarifaDiaria() {
        return tarifaDiaria;
    }

    public int getPendientePago() {
        return pendientePago;
    }

    public void setCocheAlquilado(boolean Alquilado) {
        cocheAlquilado = Alquilado;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public void setPendientePago(int PendientePago) {
        this.pendientePago = PendientePago;
    }

    public void alquliarCoche(int dias) {
        if (pendientePago != 0) {
            System.out.println("Error: quedan pagos pendientes, no puede alquilar un coche en este momento.");
        } else if (cocheAlquilado) {
            System.out.println("Error: ya tiene alquilado un coche.");
        } else {
            this.cocheAlquilado = true;
            diasAlquiler = dias;
            pendientePago = tarifaDiaria * diasAlquiler;
        }
    }

    public int calcularMulta(int diasRetraso){
        int multa;
        multa = (diasRetraso / 2 + diasRetraso % 2) * 100;
        return multa;
    }

    public void devolverCoche(int diasRetraso){
        cocheAlquilado = false;
        System.out.println("Dias de retraso: " + diasRetraso);
        if (diasRetraso > 0){
            pendientePago = pendientePago + calcularMulta(diasRetraso);
        }
        diasAlquiler = 0;
    }

    public void mostrarPagosPendientes(){
        System.out.println("*****************************");
        System.out.println("Cliente: " + this.nombre); // se puede con los getters
        System.out.println("DNI: " + this.dni);
        System.out.println("Pagos pendientes: " + this.pendientePago);
        System.out.println("*****************************");
    }

    public void consultarEstadoAlquiler() {
        System.out.println("*****************************");
        if (cocheAlquilado) {
            System.out.println("Coche alquilado: SI");
            System.out.println("Dias restantes de alquiler: " + this.diasAlquiler);
        } else {
            System.out.println("Coche alquilado: NO");
        }
        System.out.println("*****************************");
    }

    public void pagarFactura(){
        pendientePago = 0;
        System.out.println("Has pagado la factura.");
    }
}
