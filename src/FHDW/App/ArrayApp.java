package FHDW.App;

public class ArrayApp {

    private static int[] copyIntArray(int [] intArray){
        if(intArray != null){
            int [] result= new int[intArray.length];
            for (int i = 0; i < intArray.length; i++){
                result[i] = intArray[i];
            }
            return result;
        }else{
            return null;
        }
    }

    private static void printIntArray(int[] intArray){
        if (intArray != null){
            for(int value : intArray){
                System.out.print(" " + value);
            }
        }else{
            System.out.print("*** no array available ***");
        }
        System.out.println("");
    }

    public static int[] getReverse(int[] array){
        if(array != null){
            int [] returnArray = new int [array.length];
            for(int i = 0; i < array.length; i++){
                returnArray[i] = array[array.length -1 -i];
            }
            return returnArray;
        }else{
            System.out.print("*** no available array ***");
            return null;
        }

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.print("Array!");
        //               0  1  2 ...
        int [] ArrayA = {1, 2, 3};
        /*int [] ArrayB = ArrayA;
        ArrayB[0] = 2;
        System.out.println(ArrayA[0]);

        int [] noArray = null;
        int [] ArrayC = new int [4];

        ArrayC [2] = 100;
        System.out.println(ArrayC[0]);
        System.out.println(ArrayC[2]);

        System.out.println(ArrayA.length);
        System.out.println(noArray);
        System.out.println(ArrayC.length);

        ArrayB = copyIntArray(ArrayA);
        printIntArray(noArray);
        printIntArray(ArrayA);
        printIntArray(ArrayB);
        printIntArray(ArrayC);*/
        printIntArray(ArrayA);
        printIntArray(getReverse(ArrayA));
    }
}

