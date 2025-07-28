package com.assignment1;

import java.util.Scanner;

public class EligibileForVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("Not eligible for voting");
		}
		
		sc.close();
	}
}
