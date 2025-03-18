package com.epam.onboardingproject.corejava;

import java.util.Iterator;
import java.util.Scanner;

public class Task03_HometaskLoops {

	public static void main(String[] args) {
		 int rows = 5, number = 1;
		for(int i = 1; i <= rows; i++) {

		      for(int j = 1; j <= i; j++) {
		        System.out.print(number-1 + " ");
		        ++number;
		      }

		      System.out.println();
		    }
		
		 int rows2 = 5, number2 = 2;
			for(int i = 2; i <= rows2; i++) {

			      for(int j = 2; j <= i; j++) {
			        System.out.print(number2 + " ");
			        ++number;
			      }

			      System.out.println();
			    }
		
	}

}
