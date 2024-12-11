
/**
 * Modela a objetos Calculadora que registran una serie de nºs y
 * calculan ciertas estadísticas
 * 
 */
public class Calculadora
{
    private Contador total; // cantidad de nºs introducidos
    private Contador igualInicioFin; //cantidad de números que empiezan y acaban con la misma cifra
    private Contador digitosIguales; // cantidad de números con todos los dígitos iguales
    private int imparMaximo;  // el valor máximo de entre los impares introducidos

    /**
     * constructor para los objetos de la clase Calculadora
     * inicializa adecuadamente los atributos
     */
     public Calculadora()    {
        this.total = new Contador();
        this.igualInicioFin = new Contador();
        this.digitosIguales = new Contador();
        this.imparMaximo = 0;
    }

    /**
     * añade un nº a la calculadora
     * Habrá que actualizar adecuadamente el estado de la calculadora
     * 
     * @param  n el nº a añadir, se recibe un nº positivo
     */
    public void addNumero(int n)    {
        if (n>=0) {
            this.total.incrementar();
        } else {
            this.total.setValor(this.total.getValor());
        }
        if (empiezaAcabaIgual(n)){
            this.igualInicioFin.setValor(this.igualInicioFin.getValor() + 1);
        } else if(n > this.imparMaximo){
            this.imparMaximo = n;
        }
        }
    }

    /**
     * Devuelve true si el argumento n empieza 
     * y termina con el mismo dígito
     * 
     * Por ejemplo, para n = 1441  devuelve true
     *              para n = 14  devuelve false
     *              para n =  2  devuelve true
     *              para n = 78987   devuelve true
     */
    private boolean empiezaAcabaIgual(int n)   {
        int posicion = 0;
        int divisor = 10;
        while (n % divisor >= 1){
            divisor = divisor * 10;
            posicion++;
        }
        int valorIzda = n / (int)Math.pow(10,posicion);
        int valorDcha = n % 10;
        return (valorIzda == valorDcha );
    }

    /**
     * Detecta si n es o no impar
     *   
     */
    private boolean esImpar(int n)   {
        if (n % 2 == 1){
            return true;
        }else {
            return false;
        }
        
    }

    /**
     *  devuelve true si todas las cifras son iguales,
     *  false en otro caso.
     *  
     */
    private boolean todosIguales(int n)   {
         //TODO
         return true;
    }


    /**
     * Muestra en pantalla las estadísticas  
     * (ver resultados de ejecución)
     */
    public void  printEstadisticas()    {
        System.out.println("*******************************************************************");
        System.out.println("Números añadidos: " + this.total.getValor());
        System.out.println("Números capicua: " + this.igualInicioFin.getValor());
        System.out.println("Números con dígitos iguales: " + this.digitosIguales.getValor());
        System.out.println("Número impár máximo: " + this.imparMaximo);
        System.out.println("*******************************************************************");
    }
}
