package FHDW.Models;

public class Tutor extends Person{
    //eigentlich Lecturer
    private Role role;
    private Department department;

    public Tutor(String name, Location residence, Role role, Department department){
        super(name, residence);
        this.role = role;
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        return "Tutor{" +
                "name='" + super.getName() + '\'' +
                ", residence=" + super.getResidence() +
                ", role=" + role +
                ", department=" + department +
                '}';
    }

}
