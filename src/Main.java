import Person.Student;
import Person.Teacher;
import School.*;
import School.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Jimmy","2001:03:05");
        Student student2 = new Student(2,"Jimmy2","2001:03:06");
        Student student3 = new Student(3,"Jimmy3","2001:03:07");
        Teacher teacher1 = new Teacher(1,"Tom","1985:05:05");
        Teacher teacher2 = new Teacher(2,"Tom2","1985:05:06");
        Teacher teacher3 = new Teacher(3,"Tom3","1985:05:07");

        Absence absence = new Absence(1, student1, Subject.MATH,teacher1,"2022:01:31");
        Grade grade1 = new Grade(1,9.0,Subject.MATH,student1,teacher1);
        Grade grade2 = new Grade(2,8.5,Subject.MATH,student2,teacher1);
        Grade grade3 = new Grade(3,7.0,Subject.MATH,student3,teacher1);

        Class classA = new Class(new ArrayList<>(Arrays.asList(student1,student3)) ,"First Class");
        Class classB = new Class((new ArrayList<>(List.of(student2))),"Second Class");

        Catalog catalogA = new Catalog(1,classA);
        catalogA.setGrades(new ArrayList<>(Arrays.asList(grade1,grade3)) );

        Catalog catalogB = new Catalog(2,classB);
        catalogB.setGrades(new ArrayList<>(List.of(grade2)));

        School school = new School(
                new ArrayList<>(Arrays.asList(teacher1,teacher2,teacher3)),
                new ArrayList<>(Arrays.asList(student1,student2,student3)),
                new ArrayList<>(Arrays.asList(catalogA,catalogB)),
                new ArrayList<>( Arrays.asList(classA,classB))
        );

        System.out.println(school.calculateStudentAverage(student1));
        System.out.println(school.calculateClassGradeAverage(classA));
        System.out.println(school.calculateClassGradeAverageForSubject(classA,Subject.MATH));


    }
}
