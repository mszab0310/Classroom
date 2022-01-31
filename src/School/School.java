package School;

import Person.Student;
import Person.Teacher;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Catalog> catalogs;
    private ArrayList<Class> classes;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<Catalog> catalogs, ArrayList<Class> classes) {
        this.teachers = teachers;
        this.students = students;
        this.catalogs = catalogs;
        this.classes = classes;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(ArrayList<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public double calculateStudentAverage(Student student){
        Class studentClass = null;
        for(Class classs : classes){
            if(classs.getStudents().contains(student)){
                studentClass = classs;
            }
        }
        if(studentClass == null){
            System.out.println("No such student");
            return -1;
        }

        Catalog catalogStudent = null;
        for(Catalog catalog : catalogs){
            if( catalog.getClassName().equals(studentClass)){
                catalogStudent = catalog;
            }
        }
        if(catalogStudent == null){
            System.out.println("No catalog for class of student");
            return -2;
        }
        int count = 0;
        double sum = 0.0;
        for(Grade grade : catalogStudent.getGrades()){
            if(grade.getStudent().equals(student)){
                count++;
                sum += grade.getValue();
            }
        }
        if(count == 0) {
            System.out.println("No grades for student");
            return -3;
        }
        return sum/(double) count;
    }

    public double calculateClassGradeAverage(Class classs){
        Catalog searchedCatalog = null;
        for(Catalog catalog : catalogs){
            if(catalog.getClassName().equals(classs)){
                searchedCatalog = catalog;
            }
        }
        if(searchedCatalog == null){
            System.out.println("No such class");
            return -1;
        }
        int count = 0;
        double sum = 0.0;
        for(Grade grade : searchedCatalog.getGrades()){
            count++;
            sum += grade.getValue();
        }
        if(count == 0){
            System.out.println("No grades for class");
            return -2;
        }
        return sum/(double)count;
    }

    public double calculateClassGradeAverageForSubject(Class classs, Subject subject){
        Catalog searchedCatalog = null;
        for(Catalog catalog : catalogs){
            if(catalog.getClassName().equals(classs)){
                searchedCatalog = catalog;
            }
        }
        if(searchedCatalog == null){
            System.out.println("No such class");
            return -1;
        }
        int count = 0;
        double sum = 0.0;
        for(Grade grade : searchedCatalog.getGrades()){
            if(grade.getSubject().equals(subject)) {
                count++;
                sum += grade.getValue();
            }
        }
        if(count == 0){
            System.out.println("No grades for subject in class");
            return -2;
        }
        return sum/(double)count;
    }



}
