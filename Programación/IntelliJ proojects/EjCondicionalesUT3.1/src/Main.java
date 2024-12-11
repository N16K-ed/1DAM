public class Main {
    public static void main(String[] args) {

        posYNeg(0);

    }
    private static void posYNeg(int var1){
        if(var1 > 0){
            System.out.println("El número " + var1 + " es positivo.");
        }else if(var1 < 0){
            System.out.println("El número " + var1 + " es negativo.");
        }else if (var1 == 0){
            System.out.println("El número es 0");
        }
    }
}