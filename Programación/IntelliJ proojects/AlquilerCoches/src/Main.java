public class Main {
    public static void main(String[] args) {
        Cliente Client1 = new Cliente("awiwi", "wiwi");


        Client1.alquliarCoche(5);
        Client1.consultarEstadoAlquiler();
        Client1.mostrarPagosPendientes();
        Client1.devolverCoche(9);
        Client1.mostrarPagosPendientes();
        Client1.consultarEstadoAlquiler();
        Client1.pagarFactura();
        Client1.mostrarPagosPendientes();



    }
}