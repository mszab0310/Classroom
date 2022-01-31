package School;

import java.util.ArrayList;

public class Catalog {
    private int id;
    private Class className;
    ArrayList<Grade> grades;
    ArrayList<Absence> absences;

    public Catalog(int id, Class className) {
        this.id = id;
        this.className = className;
    }

    public ArrayList<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(ArrayList<Absence> absences) {
        this.absences = absences;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public void addAbsence(Absence absence){
        absences.add(absence);
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
