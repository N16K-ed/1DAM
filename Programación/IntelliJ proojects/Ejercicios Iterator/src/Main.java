import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Estudiante> listaPrueba = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            listaPrueba.add(new Estudiante((int)(Math.random()*11)));
        }

        Iterator<Estudiante> it = listaPrueba.iterator();
        System.out.println("\nLista de estudiantes antes del filtrado: ");
        for (Estudiante estudiante : listaPrueba) {
            System.out.println("- " + estudiante.getNombre() + " (" + estudiante.getEdad() + ") "+ "- Nota media: " +  estudiante.getNotaMedia());
        }
        System.out.print("\nIntroduzca el criterio de expulsión.\n\t(Nota más baja aceptada): ");
        int filtro = teclado.nextInt();
        while(it.hasNext()){
            if(it.next().getNotaMedia() < filtro){
                it.remove();
            }
        }
        System.out.println();
        System.out.println("Lista después de borrar:");
        for (Estudiante estudiante : listaPrueba) {
            System.out.println("- " + estudiante.getNombre() + " (" + estudiante.getEdad() + ") "+ "- Nota media: " +  estudiante.getNotaMedia());
        }

    }
}