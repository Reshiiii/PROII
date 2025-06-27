package FHDW.Demo;

public class StringBufferDemo {
    public static void main(String [] args){
        String a = "12345678";
        String b = "asbc";

        StringBuffer stringBuffer = new StringBuffer("text");

        System.out.println(stringBuffer);
        stringBuffer.append("***appended Text***");
        System.out.println(stringBuffer);

        stringBuffer.delete(0, 1);
        System.out.println(stringBuffer);

        stringBuffer.replace(0, 3, "New Text");

        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.reverse();

        stringBuffer.append(b);
        System.out.println(stringBuffer);
        stringBuffer.delete(stringBuffer.length() - b.length(), stringBuffer.length());
        System.out.println(stringBuffer);
    }
}
