package OOPSTasks;

import java.util.Scanner;

public class FlowerBouquet {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the number of flowers for each type
        String[] flowerTypes = {"Roses", "Jasmines", "Lilies"};
        int[] flowerCosts = {1, 2, 3}; // Prices for Roses, Jasmines, and Lilies

        // Initialize total cost to 0
        int totalCost = 0;

        // Loop over each flower type to take input and calculate the total cost
        for (int i = 0; i < flowerTypes.length; i++) {
            System.out.print("Enter the number of " + flowerTypes[i] + ": ");
            int flowerCount = scanner.nextInt();

            // Calculate cost for this flower type and add it to the total cost
            totalCost += flowerCount * flowerCosts[i];
        }

        // Output the total cost of the bouquet
        System.out.println("\nTotal cost of the bouquet: $" + totalCost);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
