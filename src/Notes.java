import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		
		// Scanner creation
		Scanner scan = new Scanner(System.in);
	
		// While there is a new student
		System.out.println("Souhaitez-vous saisir un nouvel élève ? O/N");
		String choice = "";
		choice = scan.nextLine();
		while(choice.equalsIgnoreCase("o")) {
		
			// Firstname and lastname captures
			System.out.println("Saisissez le prénom de l'élève");
			String firstName = scan.nextLine();
			System.out.println("Saisissez le nom de l'élève");
			String lastName = scan.nextLine();
			
			// Student scores capture
			System.out.println("Saisissez chaque note suivie par la touche entrée");
			System.out.println("Lorsque vous avez fini tapez stop puis la touche entrée");
			double average = 0;
			int counter = 0;
			while (scan.hasNext()) {
				if (scan.hasNextDouble()) {
					average += scan.nextDouble();
					counter++;					
				}
				else {
					scan.next();
					break;
				}
			}
			average = average / counter;
			
			// Student data display
			System.out.println("Pour l'élève " + firstName + " " + lastName);
			System.out.println("La moyenne de ses notes est : " + average);
			
			// While there is a new student
			System.out.println("Souhaitez-vous saisir un nouvel élève ? O/N");
			choice = scan.next();
			scan.nextLine();	
		}
		
		// Closing the program
		System.out.println("Fin de la saisie");
		scan.close();
	}
}