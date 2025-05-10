package Models;

public class Student {
    private int id;
    private String name;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String firstName, String lastName) {
        if (id > 10000 && id < 100000){
            this.id = id;
        }
        else{
            this.id = 0;
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Student student){
        return this.getId() == student.getId();
    }

    public String toString(){
        return "ID: " + this.id + ", Vorname: " + this.firstName + ", Nachname: " + this.lastName;
    }

}
