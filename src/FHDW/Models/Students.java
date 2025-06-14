package FHDW.Models;

public class Students {
    private Student[] studentArray;

    public Students() {
        studentArray = new Student[Student.LAST_ID];
    }

    public void addStudent(Student student){
        studentArray[student.getId()] = student;
    }

    public void removeStudent(int id){
        studentArray[id] = null;
    }

    public Student getStudent(int id){
        return studentArray[id];
    }

    public int getNo(){
        int counter = 0;
        if(studentArray != null){
            for(Student student : studentArray){
                if(student != null){
                    counter ++;
                }
            }
            return counter;
        }else{
            return counter;
        }
    }

    public Student[] getALl(){
        Student[] result = new Student[this.getNo()];
        int index = 0;
        for(Student student : studentArray){
            if(student != null){
                result[index++] = student;
            }
        }
        return result;
    }

    private boolean isPresent(int id){
        //<Ausdruck> ? <result a> : <result b>;
        return id >= Student.FIRST_ID && id <= Student.LAST_ID ? studentArray[id] != null : false;
    }
}

