package School;

import java.util.ArrayList;

public class Catalog {
    private int id;
    private Class className;
    ArrayList<Grade> grades;

    public Catalog(int id, Class className) {
        this.id = id;
        this.className = className;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Class getClassName() {
        return className;
    }

    public void setClassName(Class className) {
        this.className = className;
    }
}
