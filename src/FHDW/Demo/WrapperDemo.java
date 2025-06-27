package FHDW.Demo;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 123;
        Integer k = 123;
        Integer j = Integer.valueOf("123");

        String s = "string";


        Integer inWrapper = 123;//boxing

        System.out.println(inWrapper.intValue()); //unboxing

        System.out.println(inWrapper); //autounboxing
    }
}
