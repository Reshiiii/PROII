package FHDW.Models;

public enum Role {
    NO_ROLE("No Role"),
    PROFESSOR("Professor"),
    PRESIDENT("President"),
    TUTOR("Tutor"),
    ASSISSTANT("Assistent");

    private String string;

    Role(String string){
        this.string = string;
    }

    public static Role parse(String string){
        Role role = NO_ROLE;

        switch(string){
            case "No Role":
                role = NO_ROLE;
                break;
            case "Professor":
                role = PROFESSOR;
                break;
            case "President":
                role = PRESIDENT;
                break;
            case "Tutor":
                role = TUTOR;
                break;
            case "Assisstent":
                role = ASSISSTANT;
                break;
        }
        return role;
    }

    public String toString(){
        return this.string;
    }

    public static Role getRole(int i){
        for(Role role: Role.values()){
            if(role.ordinal() == i){
                return role;
            }
        }return NO_ROLE;
    }

}
