package oop_static.example2;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private List<Student> students;

    private String name;

    public List<Student> getStudents() {
        return students;
    }

    private int lastStudentNo =0;

    public void addStudent(Student student){
        if (students == null) {
            students = new ArrayList<>();
        }
        lastStudentNo++;
        student.setNo(lastStudentNo);
        students.add(student);
    }

    public int calculateNumberOfStudentsStartsWith(String character){
        int count = 0;
        for (Student student: students){
            if (student.getName().startsWith(character)) {
                count++;
            }
        }
        return count;
    }

    public float getAverageAge(){
        int totalAge = 0;
        for (Student student: students){
            totalAge = student.getAge() + totalAge;
        }
        return (totalAge*1.0f)/students.size();
    }

    public int calculateTotalNumberOfStudents(){
        return students.size();
    }

}
