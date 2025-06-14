package FHDW.Demo;

import FHDW.Models.Subject;

public class EnumDemo {
    public static void main(String[] args){
        Subject subject1 = Subject.GENERAL_MANAGEMENT;
        Subject subject2 = Subject.APPLIED_COMPUTER_SCIENCE;

        System.out.println("No equals: " + subject1.equals(subject2));

        System.out.println("Number: " + subject1.ordinal());

        Subject[] subjects = Subject.values();
        for(Subject subject : subjects){
            System.out.println("Number: " + subject.ordinal()
                                + " Name: " + subject.name()
                                + " Sprechender Name: " + subject.toString());
        }
    }
}
