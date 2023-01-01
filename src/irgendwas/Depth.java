package irgendwas;

import oop_kredit.Tilgungsplan;

public class Depth {
    final static int STANDARD_ZINS = 1;
    private int amount;
    private final int monthlyPayment;
    private final int interest;
    private final String name;

    private final int creditNumber;

    // class member
    private static int nextCreditNumber = 0;

    Depth(String name, int amount, int monthlyPayment, int interest) {
        this.name = name;
        this.amount = amount;
        this.monthlyPayment = monthlyPayment;
        this.interest = interest;

        this.creditNumber = Depth.nextCreditNumber++;
    }

    Depth(String name, int amount, int monthlyPayment) {
        this(name, amount, monthlyPayment, STANDARD_ZINS);
    }

    void printAmount() {
        System.out.println("Schuld namens "
                + this.name + " ist derzeit "
                + this.amount);
    }

    public String toString() {
        return this.name + " | " + this.amount + " | " + this.interest;
    }

    Tilgungsplan getTilgungsplan() {
        return null;
    }
}
