 package Model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    private String code;
    private String name;
    private int credits;
    private List<Student> students;
    
    public Course() {
    }

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.students = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
@Override
public String toString(){
    return name + 
    ", " + code +
    ", " + credits;
}

    
}