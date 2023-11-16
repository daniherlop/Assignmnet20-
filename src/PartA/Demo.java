package PartA;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.int);
		System.out.println("Please give me the inventory ");
		int maxComputer = kb.nextInt();
		Computer[] inventory = new Computer [];
		int choice;
		do {
			System.out.println("menu: ");
			System.out.println("1:");
			System.out.println("2: ");
			System.out.println("3: ");
			System.out.println("4: ");
			System.out.println("give me choice: ");
			choice = kb.nextInt();
			
		} while(choice !=5);
	}

}
