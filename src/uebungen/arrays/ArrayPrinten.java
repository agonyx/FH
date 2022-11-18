package uebungen.arrays;

public class ArrayPrinten {
    public static void main(String[] args) {
        int[] intArray= new int[5];
        printArray(intArray);
        System.out.println("\n");
        printArray(intArray, 0);
    }

    private static void printArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Stelle: "+ i + " Wert: "+ intArray[i]+"\n");
        }
    }

    private static void printArray(int[] intArray,int index){
        if (index>=intArray.length){
        }else {
            System.out.print("Stelle: "+ index + " Wert: "+ intArray[index]+"\n");
            printArray(intArray,index+1);
        }
    }
}