package School;

import Person.Student;
import Person.Teacher;

public class Grade {
    private int id;
    private double value;
    private Subject subject;
    private Student student;
    private Teacher teacher;

    public Grade(int id, double value, Subject subject,Student student, Teacher teacher) {
        this.id = id;
        this.value = value;
        this.subject = subject;
        this.student = student;
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
}
