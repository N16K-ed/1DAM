import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(CodCesar());
    }
    private static String CodCesar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el texto a traducir: ");
        String string = teclado.nextLine();
        System.out.println("Introduzca el Nº de desplazamiento: ");
        int desplazamiento = teclado.nextInt();
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        String nuevo = string;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != ' '){
                    nuevo = nuevo.replace(string.charAt(i),abecedario.charAt(abecedario.indexOf(string.charAt(i)+desplazamiento)));
                }
        }return nuevo;
    }
}