import java.util.Scanner;  // Import the Scanner class

public class Main{ public static void main(String[] args){

        //System.out.println("Hello World!");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        //promt user input year of birht
        System.out.println("what is your year of birht");

        int year = myObj.nextInt();

        int age = 2025-year;
        System.out.println("you are " + age + "years old");

        String decmial = "3.45";

        double double1 = Double.parseDouble(decmial);

        System.out.println("double number" + double1);
    }
}