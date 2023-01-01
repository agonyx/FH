package weitereAufgaben;

public class Main {
    public static void main(String[] args) {
        Datum datum = new Datum(31,2,2022);
        Datum datum1 = new Datum(31,2,2024);
        System.out.println(datum.abstandZweierDaten(datum1));
        System.out.println(datum1.schaltJahr());
        System.out.println(datum1);
    }
}
