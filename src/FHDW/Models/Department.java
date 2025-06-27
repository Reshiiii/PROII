package FHDW.Models;

public enum Department {
    NO_DEPARTMENT("No Department"),
    BUSINESS_SCIENCE("Business Science"),
    COMPUTER_SCIENCE("Computer Science");

    private String string;

    Department(String string){
        this.string = string;
    }

    public static Department parse(String string){
        Department department = NO_DEPARTMENT;

        switch(string){
            case "No Department":
                department = NO_DEPARTMENT;
                break;
            case "Business Science":
                department = BUSINESS_SCIENCE;
                break;
            case "Computer Science":
                department = COMPUTER_SCIENCE;
                break;
        }
        return department;
    }

    public String toString(){
        return this.string;
    }

    public static Department getDepartment(int i){
        for(Department department: Department.values()){
            if(role.ordinal() == i){
                return department;
            }
        }return NO_DEPARTMENT;
    }

}
