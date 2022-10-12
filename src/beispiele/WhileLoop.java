package beispiele;

/**
 * @author Jann-Leon Winkler
 */
public class WhileLoop {

    public static void main(String[] args) {
        boolean bool = true;
        int number = 0;
        while (bool) {
            System.out.println(number);
            number++;
            if(number == 5) {
                bool = false;
            }
        }
    }
}
