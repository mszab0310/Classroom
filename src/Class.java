import java.util.ArrayList;

public class Class {
    private ArrayList<Student> students;
    private String name;

    public Class(ArrayList<Student> students, String name) {
        this.students = students;
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
