package com.assignment1;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		if(num == 1) {
			System.out.println("neither composite nor prime");
		}
		for(int i = 2; i*i <= num; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		
		if(!isPrime) {
			System.out.println(num+" is not prime");
		} else {
			System.out.println(num+" is prime");
		}
		
		sc.close();
	}
}
