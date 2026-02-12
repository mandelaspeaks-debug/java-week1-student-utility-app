import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StudentUtilityApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Pick a number from 1 - 5: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addTwoNumbers(scanner);
                case 2 -> checkOddOrEven(scanner);
                case 3 -> printNumbers(scanner);
                case 4 -> System.out.println("the fourth");
                case 5 -> System.out.println("Exit");
                default -> System.out.println("LAST LAST");
            }



        } while (choice != 5);
        scanner.close();

    }


    // the methods I will be using

    public static void addTwoNumbers(Scanner scanner) {
        System.out.println("\n Pick two numbers");

        System.out.println("Enter first Number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number2 + number1;
        System.out.println("The Sum of your number is: " + sum);



    }

    public static void checkOddOrEven (Scanner scanner) {
        System.out.println("Enter a number");
        int numba = scanner.nextInt();
        System.out.println((numba % 2 == 0)? "EVEN" : "ODD");
    }

    public static void printNumbers (Scanner scanner) {
        System.out.println("Pick a random number: ");
        int printer = scanner.nextInt();
        for (int i = 1; i <= printer; i++) {
            System.out.println(i);
        }
    }

}
