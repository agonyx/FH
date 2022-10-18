package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class RaetselForSchleife {
    public static void main(String[] args) {
        String blank = " ";
        for(int i = 0; i < 4; i++) {
            System.out.println(blank.repeat(i) + "*");
        }
        System.out.println(" << fertig");
    }
}
