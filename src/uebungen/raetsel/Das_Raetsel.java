package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class Das_Raetsel {
    public static void main(String[] args) {
        int i = 0;
        String blank = " ";
        while(i < 4) {
            System.out.println(blank.repeat(i) +"*");
            i++;
        }
        System.out.println(" << fertig");
    }
}
