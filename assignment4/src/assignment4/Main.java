package assignment4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter booking details (format: stageEvent,customer,noOfSeats):");
        String input = sc.nextLine();
        String[] bookingDetails = input.split(",");

        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        int noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        System.out.println("Enter payment mode (1: Cash, 2: Wallet, 3: Credit card):");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                // Cash payment
            	System.out.println("Enter amount to pay in cash:");
                double amount1 = sc.nextDouble();
                booking.makePayment(amount1);
                break;
            case 2:
                // Wallet payment
            	System.out.println("Enter amount to pay using wallet:");
                double amount2 = sc.nextDouble();
                System.out.println("Enter wallet number ");
                String wallet = sc.next();
                booking.makePayment(wallet, amount2);
                break;
            case 3:
                // Credit card payment
            	System.out.println("Enter amount to pay using credit card:");
                double amount3 = sc.nextDouble();
                System.out.println("Enter cvv no. ");
                String ccv = sc.nextLine();
                booking.makePayment("Master", ccv, amount3);
                break;
            default:
                System.out.println("Invalid choice");
        }


        sc.close();
	}

}
