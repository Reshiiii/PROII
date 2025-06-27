package FHDW.Models;

public class Tutor {
    //eigentlich Lecturer
    private String name;
    private Location residence;
    private Role role;
    private Department department;

    public Tutor(String name, Location residence, Role role, Department department){
        this.name = name;
        this.residence = residence;
        this.role = role;
        this.department = department;
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
                "name='" + name + '\'' +
                ", residence=" + residence +
                ", role=" + role +
                ", department=" + department +
                '}';
    }

}
