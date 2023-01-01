package irgendwas;

import irgendwas.Depth;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to now");

        Depth myDepthA = new Depth("Schuld A", 10000, 100, 1);
        Depth myDepthB = new Depth("Schuld B", 1000000, 500, 1);

        System.out.println(myDepthA);
        System.out.println(myDepthB);
    }
}