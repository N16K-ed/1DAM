public class Main {
    public static void main(String[] args) {
        // Crear los pacientes con los datos especificados
        Paciente juan = new Paciente("Juan", 1.65, 97);
        Paciente ana = new Paciente("Ana", 1.69, 68);
        Paciente pedro = new Paciente("Pedro", 1.92, 70);
        Paciente susana = new Paciente("Susana", 1.64, 61);

        // Mostrar los datos de cada paciente
        System.out.println("****************************************");
        mostrarDatosPaciente(juan);
        System.out.println("****************************************");
        mostrarDatosPaciente(ana);
        System.out.println("****************************************");
        mostrarDatosPaciente(pedro);
        System.out.println("****************************************");
        mostrarDatosPaciente(susana);
        System.out.println("****************************************");

        // Comprar sesiones
        juan.comprarSesiones(5);
        ana.comprarSesiones(1);
        pedro.comprarSesiones(7);
        susana.comprarSesiones(12); // Se compran solo 10 porque es el máximo

        System.out.println("Total pagado Juan: " + juan.getYaPagado() + "€");
        System.out.println("Total pagado Ana: " + ana.getYaPagado() + "€");
        System.out.println("Total pagado Pedro: " + pedro.getYaPagado() + "€");
        System.out.println("Total pagado Susana: " + susana.getYaPagado() + "€");




        // Realizar las sesiones especificadas
        juan.realizarSesion(11, 0, 12, 23); // Sesión 1 de Juan
        juan.realizarSesion(17, 20, 18, 46); // Sesión 2 de Juan

        ana.realizarSesion(9, 5, 11, 17); // Sesión 1 de Ana
        ana.realizarSesion(12, 0, 12, 55); // Sesión 2 de Ana

        pedro.realizarSesion(10, 0, 11, 3); // Sesión 1 de Pedro
        pedro.realizarSesion(11, 0, 12, 23); // Sesión 2 de Pedro

        susana.realizarSesion(16, 20, 18, 5); // Sesión 1 de Susana
        susana.realizarSesion(12, 22, 13, 15); // Sesión 2 de Susana

        // Imprimir el número de sesiones disponibles
        System.out.println("Sesiones disponibles:");
        System.out.println("Juan: " + juan.getSesionesDisponibles());
        System.out.println("Ana: " + ana.getSesionesDisponibles());
        System.out.println("Pedro: " + pedro.getSesionesDisponibles());
        System.out.println("Susana: " + susana.getSesionesDisponibles());

        // Imprimir el tiempo total de sesiones de cada paciente
        juan.imprimirTiempoTotalSesiones();
        ana.imprimirTiempoTotalSesiones();
        pedro.imprimirTiempoTotalSesiones();
        susana.imprimirTiempoTotalSesiones();
    }

    public static void mostrarDatosPaciente(Paciente paciente) {
        // Mostrar nombre, peso, altura y IMC
        System.out.println("Nombre del paciente: " + paciente.getNombre());
        System.out.println("Peso de " + paciente.getNombre() + ": " + paciente.getPeso() + " kg");
        System.out.println("Altura de " + paciente.getNombre() + ": " + paciente.getAltura() + " m");

        // Calcular y mostrar el IMC
        double imc = paciente.calculaIMC();
        System.out.println("IMC de " + paciente.getNombre() + ": " + String.format("%.2f", imc));

        // Mostrar la recomendación según el IMC
        paciente.mostrarRecomendación();

        // Calcular el peso ideal y mostrarlo
        double pesoIdeal = paciente.calcularPesoIdeal();
        System.out.println("El peso ideal de " + paciente.getNombre() + " sería: " + String.format("%.2f", pesoIdeal) + " kg");

        // Si el paciente está en pre-obesidad u obesidad, mostrar cuánto debería adelgazar
        if (imc >= 25) {
            double diferenciaPeso = paciente.getPeso() - pesoIdeal;
            System.out.println("Debería adelgazar " + String.format("%.2f", diferenciaPeso) + " kg.");
        }
    }
}
