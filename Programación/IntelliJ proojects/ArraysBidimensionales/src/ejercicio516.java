public class ejercicio516 {
    private final int DIAS = 7;
    private final int TRABAJADORES = 15;
    private int[][] horasTrabajadas = new int[DIAS][TRABAJADORES];
    private String[] diasSemana = {"LUNES","MARTES","MIÉRCOLES","JUEVES","VIERNES","SÁBADO","DOMINGO"}; //Se puede hacer como un enum: public enum <<nombre>>{...}

    public ejercicio516(){
        inicializarBidimensional();
    }
    public void inicializarBidimensional(){
        for (int p_dias = 0; p_dias < DIAS; p_dias++){
            for (int p_trabajadores = 0; p_trabajadores < TRABAJADORES; p_trabajadores++){
                horasTrabajadas[p_dias][p_trabajadores] = (int) (Math.random() * 5 + 8);
            }
        }
    }

    public int[] calcularHoras(){
        int[] horas = new int[DIAS];
        int suma;
        for (int i = 0; i < horas.length; i++){
            suma = 0;
            for (int trabajadores = 0; trabajadores < TRABAJADORES; trabajadores++){
                suma = suma + horasTrabajadas[i][trabajadores];
            }
            horas[i] = suma;
        }
        return horas;
    }

    public void escribirDiaHoras(){
        for (int i = 0; i < horasTrabajadas.length; i++){
            System.out.println(diasSemana[i] + ": " + calcularHoras()[i] + " horas trabajadas totales.");
        }
    }
}
