public class Main {
    public static void main(String[] args) {

        // Crear dos clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678A");
        Cliente cliente2 = new Cliente("María López", "87654321B");

        // Simulación para el Cliente 1
        System.out.println("=== Simulación para el Cliente 1 ===");
        cliente1.recogerBicicleta(); // Recoger bicicleta
        cliente1.guardarBicicleta(16); // Guardar bicicleta (usó 16 minutos)
        cliente1.pagarFactura(); // Pagar factura
        cliente1.mostrarTiempoTotal(); // Mostrar tiempo total alquilado
        System.out.println("Nivel del Cliente 1: " + cliente1.nivelCliente()); // Mostrar nivel del cliente
        System.out.println("Total pagado Cliente 1: " + cliente1.getTotalPagado() + "€"); // Mostrar pago total

        System.out.println("\n=== Simulación para el Cliente 1: Segundo Alquiler ===");
        cliente1.recogerBicicleta(); // Recoger de nuevo la bicicleta
        cliente1.guardarBicicleta(46); // Guardar bicicleta (usó 46 minutos)
        cliente1.pagarFactura();
        cliente1.mostrarTiempoTotal();
        System.out.println("Nivel del Cliente 1: " + cliente1.nivelCliente());
        System.out.println("Total pagado Cliente 1: " + cliente1.getTotalPagado() + "€"); // Mostrar pago total

        System.out.println(mensajePremio(cliente1.nivelCliente()));

        // Simulación para el Cliente 2
        System.out.println("\n=== Simulación para el Cliente 2 ===");
        cliente2.recogerBicicleta(); // Recoger bicicleta
        cliente2.guardarBicicleta(32); // Guardar bicicleta (usó 32 minutos)
        cliente2.pagarFactura(); // Pagar factura
        cliente2.mostrarTiempoTotal(); // Mostrar tiempo total alquilado
        System.out.println("Nivel del Cliente 2: " + cliente2.nivelCliente()); // Mostrar nivel del cliente
        System.out.println("Total pagado Cliente 2: " + cliente2.getTotalPagado() + "€"); // Mostrar pago total

        System.out.println("\n=== Simulación para el Cliente 2: Segundo Alquiler ===");
        cliente2.recogerBicicleta(); // Recoger de nuevo la bicicleta
        cliente2.guardarBicicleta(50); // Guardar bicicleta (usó 50 minutos)
        cliente2.pagarFactura();
        cliente2.mostrarTiempoTotal();
        System.out.println("Nivel del Cliente 2: " + cliente2.nivelCliente());
        System.out.println("Total pagado Cliente 2: " + cliente2.getTotalPagado() + "€"); // Mostrar pago total


        System.out.println(mensajePremio(cliente2.nivelCliente()));
    }

    private static String mensajePremio(String nivelCliente){
        String premio = "";
        switch (nivelCliente){
            case "Iniciado":
                premio = "No tienes premio. Sigue usando la aplicación.";
                break;
            case "Avanzado":
                premio = "Premio de 100€";
                break;
            case "Premium":
                premio = "Premio de un kit de herramientas para bicicletas";
                break;
            case "Trotamundos":
                premio = "Premio de una Bicicleta BTT";
                break;
        }return premio;
    }
}
