import java.util.Scanner;
//Name: Mohammed Karim El Moussadeq
//assignement 3 / date: 09/03/2025
// description: writing four functions and calling them in the main class one function that calculate the sum and takes two parameters
//              one function that calculate multplication doing a overloading one with 2 parameters and another one with 3
//              and last function that reverse a string.
public class Main {
    public static void main(String[] args) {
        //Question 1
        // calling the first function, Basic Method Definition
        Scanner scanner = new Scanner(System.in);
        // taking input of the integers
        System.out.print("Enter your first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = scanner.nextInt();

        //calling the method and displaying the results
        int sum = CalculateSum.calculateSum(number1,number2);
        System.out.print("Sum of the two numbers: " + sum);

        //Question 2
        // Method Overloading calling the function of two integers
        int  productOfTwo = MultiplyOverloading.multiply(4,5);
        // Calling the method of three integers
        int productOfThree = MultiplyOverloading.multiply(2,3,10);
        scanner.nextLine();
        System.out.print("\nThe product of two numbers: " + productOfTwo);
        System.out.print("\nThe product of three numbers: " + productOfThree);


        // Question 3
        // Method with an Array Parameter
        System.out.print("\nEnter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i< size; i++) {
            numbers[i] = scanner.nextInt();
        }
        // calling the method to find the max value
        int max = FindMax.findMax(numbers);
        System.out.print("The maximum value is: " + max);


        //Question 4
        //Recursive Method
        scanner.nextLine();
        System.out.print("\nEnter a string: ");
        String string = scanner.nextLine();
        //calling the method
        String reversed = ReverseString.reverseString(string);
        System.out.print("Reversed string: " + reversed);

        scanner.close();

    }
}