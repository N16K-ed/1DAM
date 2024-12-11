package franciscoJavierSanNicolás;

import java.util.Scanner;

public class SanNicolas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("Elige si quieres registrar un animal o un hábitat:");
		System.out.println("Animal = 1");
		System.out.println("Hábitat = 2");
		System.out.println("***********************************************************");
		int variable = teclado.nextInt();
		
		String animal_habitat ="";
		switch (variable) {
			
		case 1:
			System.out.println("Has seleccionado: Registrar un animal.");
			animal_habitat = "animal";
			break;
		case 2:
			System.out.println("Has seleccionado: Registrar un hábitat.");
			animal_habitat = "habitat";
			break;
		default:
			System.out.println("Selecciona una oppción válida");	
		}
		
		if (animal_habitat == "animal") {
			System.out.println("***********************************************************");
			System.out.println("Introduce los datos del animal:");
			System.out.println("Puede no introducir ningún dato, introducir un nombre o introducir un nombre, una especie, número de patas y edad del animal.");
			System.out.println("Si no quiere introducir algún dato, introduzca 'vacio'(sin tilde).");
			System.out.println("Si no introduce un nombre, independientemente de los demas datos, se registrará un animal por defecto.");
			
			System.out.println("Nombre:");
			String nombreAnimal = teclado.next();
			
			System.out.println("Especie:");
			String especieAnimal = teclado.next();
			
			System.out.println("Patas:");
			int n_patasAnimal = teclado.nextInt();
			
			System.out.println("Edad:");
			int edad = teclado.nextInt();
			
			if (nombreAnimal == "vacio"){
				Animal animalRegistrado1 = new Animal();
				System.out.println(animalRegistrado1.toString());
			} else if (especieAnimal == "vacio") {
				Animal animalRegistrado2 = new Animal(nombreAnimal);
				System.out.println(animalRegistrado2.toString());
			} else {
				Animal animalRegistrado3 = new Animal(nombreAnimal, especieAnimal, n_patasAnimal, edad);
				System.out.println(animalRegistrado3.toString());
			}
			
		} else if (animal_habitat == "habitat") {
			System.out.println("***********************************************************");
			System.out.println("Introduce los datos del hábitat:");
			System.out.println("Puede no introducir ningún dato, introducir un nombre o introducir un nombre y un lugar.");
			System.out.println("Si no quiere introducir algún dato, introduzca ' vacio '(sin tilde).");
			System.out.println("Si no introduce un nombre, independientemente de los demas datos, se registrará un hábitat por defecto.");
			
			
			System.out.println("Nombre:");
			String nombreHabitat = teclado.next();
			
			System.out.println("Lugar:");
			String nombreLugar = teclado.next();
			
						
			if (nombreHabitat == "vacio"){
				Hábitat habitatRegistrado = new Hábitat();
				System.out.println(habitatRegistrado.toString());
			} else if (nombreLugar == "vacio") {
				Hábitat habitatRegistrado = new Hábitat(nombreHabitat);
				System.out.println(habitatRegistrado.toString());
			} else {
				Hábitat habitatRegistrado = new Hábitat(nombreHabitat, nombreLugar);
				System.out.println(habitatRegistrado.toString());
			}
			
			
		} else {
			System.out.println("***********************************************************");
			System.out.println("Error");
		}

	}

}
