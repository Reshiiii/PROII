package FHDW.Models;

public enum Subject {
    NO_SUBJECT("No Subject"),
    APPLIED_COMPUTER_SCIENCE("Applied Computer Science"),
    IT_MANAGEMENT_AND_INFORMATION_SYSTEM("It Management and Information System"),
    GENERAL_MANAGEMENT("General Management");


    private final String name;
    Subject(String name) {
        this.name = name;
    }

    public static Subject subject(int i){
        int j = 0;
        for(Subject subject: Subject.values()){
            if(j == i){
                return subject;
            }
        }return Subject.NO_SUBJECT;
    }

    public static Subject parse(String string){
        Subject subject = Subject.NO_SUBJECT;

        switch(string){
            case "No Subject":
                subject = Subject.NO_SUBJECT;
                break;
            case "Applied Computer Science":
                subject = Subject.APPLIED_COMPUTER_SCIENCE;
                break;
            case "It Management and Information System":
                subject = Subject.IT_MANAGEMENT_AND_INFORMATION_SYSTEM;
                break;
            case "General Management":
                subject = Subject.GENERAL_MANAGEMENT;
                break;
        }
        return subject;
    }

    public String toString(){
        return this.name;
    }

    public static Subject getSubject(int i){
        int j = 0;
        for(Subject subject: Subject.values()){
            if(j == i){
                return subject;
            }
            j++;
        }return Subject.NO_SUBJECT;
    }
}
