package oop_kredit;

public class Tilgungsplan {
    private int amount;
    private int intrest;
    private int duration;

    public Tilgungsplan(int amount, int intrest, int duration) {
        this.amount = amount;
        this.intrest = intrest;
        this.duration = duration;
    }

    /**
     * Drucke den Tilgungsplan komplett aus.
     */
    void print() {
        System.out.println("hier würde ich den Tilgungsplan ausgeben");
    }

    /**
     * Liefert die Raten des aktuellen Monats
     * @param monat erster Monat ost Monat 0, danach
     *              wird jeweils inkrementiert
     * @return rate dieses Monats
     */
    int giveMonthlypayment(int amount, int duration, int intrest) {
        return amount; // dummy
    }

    /**
     * Liefert die Zinsen des aktuellen Monats
     * @param monat erster Monat ost Monat 0, danach
     *              wird jeweils inkrementiert
     * @return rate dieses Monats
     */
    int gibZinsen() {
        return amount*intrest/100; // dummy
    }
}
