package uebungen.bitmasken;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Jann-Leon Winkler
 */
public class Datentypen1 {


    public static void main(String[] args) {
        int v = 42;
        int stelle = 0;
        List<Integer> vBitform = new ArrayList<>();
        for (int mask = 0b1; mask < v; mask = mask << 1) {
            int bitstate = mask & v;
            if(bitstate>0) {
                System.out.println("Stelle "+ stelle + ": " + "Bit gesetzt!" );
                vBitform.add(1);
            } else {
                System.out.println("Stelle "+ stelle + ": " + "Bit nicht gesetzt!" );
                vBitform.add(0);
            }
            stelle++;


        }
        System.out.print(v + " in Binär: ");
        for (int i = vBitform.size(); i > 0; i--) {
            System.out.print(vBitform.get(i-1));
        }



    }
}
