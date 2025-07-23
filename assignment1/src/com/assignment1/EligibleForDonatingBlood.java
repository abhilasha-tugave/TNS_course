package com.assignment1;

import java.util.Scanner;

public class EligibleForDonatingBlood {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ");
		int age = sc.nextInt();
		System.out.println("Enter weight ");
		int weight = sc.nextInt();
		
		if(age >= 18 && weight >= 50) {
			System.out.println("Eligible for donating blood");
		} else {
			System.out.println("Not eligible for donating blood");
		}
		
		sc.close();
	}
}
