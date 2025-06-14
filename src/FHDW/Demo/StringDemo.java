package FHDW.Demo;

public class StringDemo {
    public static void main(String[] args){
        String string1 = "abcde";
        //String-Pooling Klausuraufgabe Theorie???
        String string2 = "abcde";
        String string3 = new String("abcde");
        String string4 = "abcd";
        String string5 = null;

        System.out.print("cmp string1 and string2: ");
        System.out.println(string1 == string2);

        System.out.print("cmp string1 and string3: ");
        System.out.println(string1 == string3);

        System.out.print("cmp string1 and string4: ");
        System.out.println(string1 == string4);

        System.out.print("cmp string1 and string5: ");
        System.out.println(string1 == string5);
        System.out.println(" ");


        System.out.println("ref string1: " + Integer.toHexString(System.identityHashCode(string1)));
        System.out.println("ref string2: " + Integer.toHexString(System.identityHashCode(string2)));
        System.out.println("ref string3: " + Integer.toHexString(System.identityHashCode(string3)));
        System.out.println("ref string4: " + Integer.toHexString(System.identityHashCode(string4)));
        System.out.println("ref string5: " + Integer.toHexString(System.identityHashCode(string5)));
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        System.out.println(string1.length());
        System.out.println(string1.contains(string4));
        System.out.println(string1.contains(string3));

        String errMsg = "404";
        System.out.println("Error Code: " + errMsg);

        char char_arr[] = {'w', 'a', 's', 'd'};
        String s = new String(char_arr, 1, 2);
        System.out.println(s);

        byte byte_arr[] = {1, 11, 111, 112};
        String b = new String(byte_arr);
        System.out.println(b);

    }
}
