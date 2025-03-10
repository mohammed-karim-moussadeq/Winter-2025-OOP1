//Name: Mohammed Karim El Moussadeq
//Date: 18/02/2025
//Description: developing a java program that performs various operation on array of integers.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("\nEnter the number of elements: ");
            size = scanner.nextInt();
            if (size < 1 || size > 20) {
                System.out.print("You can only store 20 numbers. Please try again.");
            }
        } while (size < 1 || size > 20);

        int[] number = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Array Elements: ");
        for (int elements : number) {
            System.out.println(elements );
        }

        // Largest and smallest numbers in the array

        int smallest = number[0];
        int largest = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
            if (number[i] > largest) {
                largest = number[i];
            }

        }
        System.out.println("\nSmallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        // Calculation of the sum and the average
        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        double average = (double) sum / number.length;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Average is: " + average + "\n");

        // Searching in the array
        System.out.println("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int num : number) {
            if (num == searchNumber) {
                found = true;
            }
        }
        if (found) {
            System.out.println(searchNumber + " is found in the array");
        } else {
            System.out.println(searchNumber + " is not found in the array");
        }

        // Sort the array (corrected sorting logic)
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : number) {
            System.out.println(num);  // Printing each number on a new line
        }

        scanner.close();
    }
}
