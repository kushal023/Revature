package MasterOppCocept;

import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("User Input ");
		
		String s=sc.nextLine();
		
		switch (s) {
		case "1" :
			System.out.println("Moving Right");
			break;
			
		case "2":
			System.out.println("Moving Left");
			break;
			
		case "3":
			System.out.println("Moving Up");
			break;
		case "4":
			System.out.println("Moving Down");
			break;
		case "q":
			break;
		default:
			System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
		}

	}

}
