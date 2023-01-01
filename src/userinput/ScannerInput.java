package userinput;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int integer = scanner.nextInt();
        System.out.println("Enter a String: ");
        String mystring = scanner.next();
        mystring+= scanner.nextLine();
        System.out.println("These are the values you've entered: " + integer + " and " + mystring);
    }
}
