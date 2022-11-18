package uebungen.arrays;

public class ArrayFuellen {
    public static void main(String[] args) {
        int[] intArray = new int[16];
        fillArray(intArray);
        printArray(intArray);
        intArray = new int[16];
        System.out.println("\n");
        fillArray(intArray, 14);
        printArray(intArray);

    }
    private static void fillArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i+1;
        }
    }
    private static void fillArray(int[] intArray, int index){
        if (index < 0) {
        } else {
            intArray[index] = index+1;
            fillArray(intArray,index-1);
        }
    }
    private static void printArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Stelle: "+ i + " Wert: "+ intArray[i]);
        }
    }
}
