package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class GeschachtelteForSchleife {
    public static void main(String[] args) {
        String asterix = "*";
        System.out.println("For-Schleife");
        for (int i = 1; i <= 5; i++) {
            System.out.println(asterix.repeat(i));
        }
        System.out.println("While-Schleife");
        int i = 0;
        while (i < 5) {
            System.out.println(asterix.repeat(i+1));
            i++;
        }

    }
}
