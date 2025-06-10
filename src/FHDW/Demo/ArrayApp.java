package FHDW.Demo;


public class ArrayApp {
    public static void main(String [] args){
        int multiDimArray [] [] = {{1, 2, 3, 4}, {6}, null, {8, 10}};

        for(int i = 0; i < multiDimArray.length; i++){
            if(multiDimArray != null){
                for(int ij = 0; ij < multiDimArray[i].length; ij++){
                    System.out.print("   " + multiDimArray[i][ij]);
                }

            }else{
                System.out.println("*** no array available ***");
            }
        }

        for(int[] intArray: multiDimArray){
            try{
                for(int value: intArray){
                    System.out.print("   " + value);
                }
            }catch (Exception e){
                System.out.print("*** no array available ***");
            }
            System.out.println();

        }

    }
}
