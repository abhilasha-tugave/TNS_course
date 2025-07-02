package assignment2;

import java.util.Scanner;

public class ATMswitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 to check balance | 2 to deposit | 3 to withdraw money | 4 to Quit");
		System.out.println("Select an one option ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Checking balance");
			break;
		case 2:
			System.out.println("You selected deposit option");
			break;
		case 3:
			System.out.println("You selected withdraw money option");
			break;
		case 4:
			System.out.println("You selected quit option");
			break;
		default:
			System.out.println("Invalid option");
		}
		
		sc.close();
	}

}
