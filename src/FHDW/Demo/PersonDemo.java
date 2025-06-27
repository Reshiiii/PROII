package FHDW.Demo;

import FHDW.Models.*;

public class PersonDemo {
    public static void main(String[] args) {
        Location residence = new Location("Detmolder Straße 143", 33604,"Bielefeld");
        Person person = new Person("Jannis John", residence);
        System.out.println(person.toString());

        Tutor tutor = new Tutor("Anna", residence, Role.PRESIDENT, Department.COMPUTER_SCIENCE);
        System.out.println(tutor.toString());
    }
}
