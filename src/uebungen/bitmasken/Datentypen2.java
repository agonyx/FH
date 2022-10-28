package uebungen.bitmasken;

/**
 * @author Jann-Leon Winkler
 */
public class Datentypen2 {
    public static void main(String[] args) {
        int v = 0b1;
        System.out.println(v);
        for (int i = 0; i < 32; i++) {
            v = v <<1;
            System.out.println("Duchlauf: "+ i);
            System.out.println(v);

        }
        System.out.println("Ab dem 30sten Durchlauf wird die Grenze der möglichen darstellbaren Zahlen des Integer Datentypen überschritten." +
                "\nDie größte Zahl die mit einem Integer dargestellt werden kann ist: " +
                Integer.MAX_VALUE + "\nUnd die kleinste Zahl die mit einem Integer dargestellt werden kann ist: " + Integer.MIN_VALUE );
        long v2 = 0b1;
        for (int i = 0; v2 > Long.MIN_VALUE; i++) {
            v2 = v2 << 1;
            System.out.println("Duchlauf: "+ i);
            System.out.println(v2);

        }
        System.out.println("Die Grenze der möglichen darstellbaren Zahlen des Long Datentypen wird bei dem 63sten Durchlauf erreicht");
    }
}
