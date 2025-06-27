package FHDW.Demo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("Dies ist ein kurzer Text");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
            System.out.println("Anzahl Token: " + stringTokenizer.countTokens());
        }
    }
}
