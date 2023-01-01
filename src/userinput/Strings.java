package userinput;

public class Strings {

    public static void main(String[] args) {
        String txt = "123456789";
        System.out.println("The length of the txt string is: " + txt.length());
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());
        String txt3 = "Dies ist ein Test";
        System.out.println(txt3.indexOf("Test"));
        String txt4 = "Substring Test";
        System.out.println(txt4.substring(0,9));
    }
}

