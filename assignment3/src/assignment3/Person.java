package assignment3;

import java.util.Scanner;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id ");
		int id = sc.nextInt();
		System.out.print("Enter name ");
		String name = sc.next();
		System.out.print("Enter age ");
		int age = sc.nextInt();
		
		Person obj = new Person(id, name, age);
		System.out.println("Id: "+obj.getId()+" Name: "+obj.getName()+" Age: "+obj.getAge());
		sc.close();
	}

}
