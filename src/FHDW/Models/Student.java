package FHDW.Models;

public class Student extends Person{
    final public static int FIRST_ID = 10001;
    final public static int LAST_ID = 99999;
    public static int nextId = FIRST_ID;
    private int id;
    private String firstName;
    private String lastName;
    private Subject subject;

    public Student(String name, Location location, Subject subject) {
        super(name, location);
        this.id = getNextId();
        this.subject = subject;
    }

    public Student(String name, int id, Location location){
        super(name, location);
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Student student){
        return this.getId() == student.getId();
    }

    public String toString(){
        return "ID: " + this.id
                + ", Name: " + super.getName()
                + ", Ort:" + super.getResidence()
                + ", Fach" + this.subject.toString();
    }

    private int getNextId(){
        if (nextId <= LAST_ID){
            //nextId = nextId + 1
            return nextId++;
        }else{
            return 0;
        }

    }

    public Subject getSubject(){
        return this.subject;
    }

    public void setSubject(Subject subject){
        this.subject = subject;
    }

    static public int getNoOfAvailableIds(){
        return LAST_ID - nextId + 1;
    }

    static public int getNoOfAssignedIds(){
        return nextId - FIRST_ID;
    }

}
