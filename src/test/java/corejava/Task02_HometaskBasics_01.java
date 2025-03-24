package corejava;

import java.util.Scanner;

public class Task02_HometaskBasics_01 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	         String name = scanner.nextLine();
	         System.out.println("Hello, " + name);
	         scanner.close();
	}

}
