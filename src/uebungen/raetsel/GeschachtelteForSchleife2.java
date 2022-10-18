package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class GeschachtelteForSchleife2 {
    public static void main(String[] args) {
        String asterix = "*";
        System.out.println("Muster: 1");
        for (int i = 5; i > 0; i--) {
            System.out.println(asterix.repeat(i));
        }
        System.out.println("Muster: 2");
        for (int i = 5; i > 0; i--) {
            if(i == 3) {
                System.out.println("-----");
            }else {
                System.out.println(asterix.repeat(i));
            }
        }
    }
}
