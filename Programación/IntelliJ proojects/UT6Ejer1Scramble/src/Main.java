import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("JUEGO DE SCRAMBLE");
        System.out.println("*******************************************");
        ArrayList<String> palabras = new ArrayList<>(60);
        palabras.add("java");
        palabras.add("python");
        palabras.add("javaScript");
        palabras.add("html");
        palabras.add("css");
        palabras.add("php");
        palabras.add("c++");
        palabras.add("c#");
        palabras.add("ruby");
        palabras.add("swift");
        palabras.add("kotlin");
        palabras.add("sql");
        palabras.add("typescript");
        palabras.add("bash");
        palabras.add("perl");
        palabras.add("dart");
        palabras.add("go");
        palabras.add("r");
        palabras.add("scala");
        palabras.add("lua");
        palabras.add("haskell");
        palabras.add("elixir");
        palabras.add("rust");
        palabras.add("objective-c");
        palabras.add("shell");
        palabras.add("matlab");
        palabras.add("groovy");
        palabras.add("fortran");
        palabras.add("pascal");
        palabras.add("cobol");
        palabras.add("vba");
        palabras.add("f#");
        palabras.add("lisp");
        palabras.add("prolog");
        palabras.add("clojure");
        palabras.add("tcl");
        palabras.add("julia");
        palabras.add("scheme");
        palabras.add("smalltalk");
        palabras.add("abap");
        palabras.add("ada");
        palabras.add("awk");
        palabras.add("pl/sql");
        palabras.add("postscript");
        palabras.add("actionscript");
        palabras.add("erlang");
        palabras.add("rexx");
        palabras.add("ocaml");
        palabras.add("icon");
        palabras.add("idl");
        palabras.add("ml");
        palabras.add("forth");
        palabras.add("foxpro");
        palabras.add("modula-2");
        palabras.add("sml");
        palabras.add("crystal");
        palabras.add("nim");
        palabras.add("chapel");
        palabras.add("cobra");
        String palabraAleatoria = palabras.get((int)(Math.random()*palabras.size()));
        ArrayList <String> charsDePalabraAleatoria = new ArrayList<>();
        for (int i = 0; i < palabraAleatoria.length(); i++){
            charsDePalabraAleatoria.add(String.valueOf(palabraAleatoria.charAt(i)));
        }
        Collections.shuffle(charsDePalabraAleatoria);
        String shuffled = "";
        for (int i = 0; i < charsDePalabraAleatoria.size(); i++){
            shuffled = shuffled + charsDePalabraAleatoria.get(i);
        }
        System.out.println("\nSu palabra a ordenar es: " + shuffled);
        System.out.println("\n*******************************************");
        System.out.println("Introduzca la palabra ordenada correcta: ");
        String palabraJugador = teclado.nextLine();
        palabraJugador = palabraJugador.trim();
        if(palabraJugador.equalsIgnoreCase(palabraAleatoria)){
            System.out.println("*******************************************\n");
            System.out.println("Enhorabuena, has acertado la palabra: " + palabraAleatoria);
            System.out.println("\n*******************************************");
        }else{
            System.out.println("*******************************************\n");
            System.out.println("Mala suerte... La palabra era: " + palabraAleatoria);
            System.out.println("\n*******************************************");
        }
    }
}