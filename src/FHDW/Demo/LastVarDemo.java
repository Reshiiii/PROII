package FHDW.Demo;

public class LastVarDemo {

    public static void testLastVar(int value, String ... strings){
        if(strings != null){
            System.out.println(value + ": " + strings.length);
            for(String string: strings){
                System.out.print("   " + string);
            }
        }else{
            System.out.print("*** no available array ***");
        }
        System.out.println();
    }

    public static void main(String[] args){
        testLastVar(1, "Test");
        testLastVar(2, "null", "eins", "zwei", "drei");
        testLastVar(3, null);
        testLastVar(4, "null");
    }
}
