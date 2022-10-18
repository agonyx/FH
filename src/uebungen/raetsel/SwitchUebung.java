package uebungen.raetsel;

/**
 * @author Jann-Leon Winkler
 */
public class SwitchUebung {
    public static void main(String[] args) {
        int value = (int)Math.round(Math.random()*10);
        System.out.println(value);
        switch (value) {
            case 0 :{
                System.out.println("Null");
                break;
            }
            case 1 :{
                System.out.println("Eins");
                break;
            }
            case 2 :{
                System.out.println("Zwei");
                break;
            }
            case 3 :{
                System.out.println("Drei");
                break;
            }
            case 4 : {
                System.out.println("Vier");
                break;
            }
            default:{
                System.out.println("Kenne ich nicht.");
                break;
            }
        }
        if (value == 0) {
            System.out.println("Null");
        } else if(value == 1) {
            System.out.println("Eins");
        } else if (value == 2) {
            System.out.println("Zwei");
        } else if (value == 3) {
            System.out.println("Drei");
        } else if (value == 4) {
            System.out.println("Vier");
        } else {
            System.out.println("Kenne ich nicht.");
        }
    }
}
