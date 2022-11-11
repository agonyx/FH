package uebungen.methoden;

public class Fakultaet {
    public Fakultaet(){
        System.out.println(fakultaetsfunktion(10));
    }
    private int fakultaetsfunktion(int n){
        if (n<=1) {
            return 1;
        } else {
            return fakultaetsfunktion(n-1)*n;
        }
    }

}
