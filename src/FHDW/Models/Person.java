package FHDW.Models;

public class Person {
    private String name;
    private Location residence;

    public Person(String name, Location residence){
        this.name = name;
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getResidence() {
        return residence;
    }

    public void setResidence(Location residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Residenz: " + residence;
    }
}
