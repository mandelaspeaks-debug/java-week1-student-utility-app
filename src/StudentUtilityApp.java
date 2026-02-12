import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StudentUtilityApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Pick a number from 1 - 5: ");
            choice = scanner.nextInt();

            // had to use the short version of the switch statement I learned while researching on how to complete the project

            switch (choice) {
                case 1 -> addTwoNumbers(scanner);
                case 2 -> checkOddOrEven(scanner);
                case 3 -> printNumbers(scanner);
                case 4 -> displayDayOfTheWeek(scanner);
                case 5 -> closeApp();
                default -> System.out.println("LAST LAST");
            }



        } while (choice != 5);
        scanner.close();

    }


    // the methods I will be using

    public static void addTwoNumbers(Scanner scanner) {
        System.out.println("Pick two numbers");

        System.out.println("Enter first Number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number2 + number1;
        System.out.println("The Sum of your number is: " + sum);



    }
// this method is to check if the number the user inputs is even or odd
    public static void checkOddOrEven (Scanner scanner) {
        System.out.println("Enter a number");
        int numba = scanner.nextInt();
        System.out.println((numba % 2 == 0)? "EVEN" : "ODD");
    }

    // Learning about the scanner method, I realized that i cab create different OBJECT of the scanner

    public static void printNumbers (Scanner scanner) {
        System.out.println("Pick a random number: ");
        int printer = scanner.nextInt();
        if (printer == 0) {
            System.out.println("Give me a real number not zero!");
        }
        for (int i = 1; i <= printer; i++) {
            System.out.println(i);
        }
    }
// this method is to display the days of the week
    public static void displayDayOfTheWeek (Scanner scanner) {
        System.out.println("Pick a number between 1 and 7 to select a day");

        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }


    }
    // this close app method could have been neglected, but I had to for readability and ease of us
    public static void closeApp () {
        System.out.println("Thank you for using this app");

    }

}
