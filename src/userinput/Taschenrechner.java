package userinput;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("Bitte geben sie Operand 1 ein: ");
            double operand = sc.nextDouble();
            System.out.println("Bitte geben sie Operand 2 ein: ");
            double operand2 = sc.nextDouble();
            System.out.println("Bitte geben sie die gewünschte Operation ein: ");
            String operation = sc.next();
            if (operation.equals("+")) {
                System.out.println("Das Ergebnis lautet: "+ (operand+operand2));
                done = true;
            } else if (operation.equals("-")) {
                System.out.println("Das Ergebnis lautet: "+(operand-operand2));
                done = true;
            } else {
                System.out.println("Unbekannte Operation: Erlaubte Operationen: [+ | -]");
            }
        }
    }
}
