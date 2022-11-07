package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class GeschachtelteForSchleife {
    public static void main(String[] args) {
        int loops = 5;
        for (int i = 1; i <= loops; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n"+"While-Schleife");
        int i = 0;
        while (i <= 5) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }

    }
}
