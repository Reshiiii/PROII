package FHDW.Models;

public class Student {
    final public static int FIRST_ID = 10001;
    final public static int LAST_ID = 99999;
    public static int nextId = FIRST_ID;
    private int id;
    private String name;
    private String firstName;
    private String lastName;
    private Location location;
    private Subject subject;

    public Student(){

    }

    public Student(String firstName, String lastName, Location location, Subject subject) {

        this.id = getNextId();

        this.firstName = firstName;
        this.lastName = lastName;

        this.location = location;
        this.subject = subject;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String firstName, String lastName) {
        if (id >= FIRST_ID && id <= LAST_ID){
            this.id = id;
        }
        else{
            this.id = 0;
        }
        this.firstName = firstName;
        this.lastName = lastName;
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
        return "ID: " + this.id
                + ", Vorname: " + this.firstName
                + ", Nachname: " + this.lastName
                + ", Ort:" + this.location.toString()
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
