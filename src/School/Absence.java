package School;

import Person.Student;
import Person.Teacher;

public class Absence {
    int id;
    Student student;
    Subject subject;
    Teacher teacher;
    String date;

    public Absence(int id, Student student, Subject subject, Teacher teacher, String date) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.teacher = teacher;
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
