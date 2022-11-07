package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class GeschachtelteForSchleife2 {
    public static void main(String[] args) {
       /* String asterix = "*";
        String blank = " ";
        System.out.println("Muster: 1");
        for (int i = 5; i > 0; i--) {
            System.out.println(blank.repeat(5-i) + asterix.repeat(i));
        }
        System.out.println("Muster: 2");
        for (int i = 5; i > 0; i--) {
            if(i == 3) {
                System.out.println("-----");
            }else {
                System.out.println(blank.repeat(5-i) + asterix.repeat(i));
            }
        }

        */
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
