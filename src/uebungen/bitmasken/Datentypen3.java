package uebungen.bitmasken;

/**
 * @author Jann-Leon Winkler
 */
public class Datentypen3 {
    public static void main(String[] args) {
        boolean[][] b = {
                {true, true},
                {true, false},
                {false, true},
                {false, false}
        };
        System.out.println("A      B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("A^B" + "\n");
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i][0] && b[i][1]);
            System.out.print("\n");
        }
        System.out.println("AvB" + "\n");
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i][0] || b[i][1]);
            System.out.print("\n");
        }


    }
}
