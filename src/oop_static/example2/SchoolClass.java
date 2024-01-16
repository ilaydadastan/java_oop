package oop_static.example2;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private List<Student> student1s;

    private String name;

    public List<Student> getStudents() {
        return student1s;
    }

    private int lastStudentNo =0;

    public void addStudent(Student student1){
        if (student1s == null) {
            student1s = new ArrayList<>();
        }
        lastStudentNo++;
        student1.setNo(lastStudentNo);
        student1s.add(student1);
    }

    public int calculateNumberOfStudentsStartsWith(String character){
        int count = 0;
        for (Student student1 : student1s){
            if (student1.getName().startsWith(character)) {
                count++;
            }
        }
        return count;
    }

    public float getAverageAge(){
        int totalAge = 0;
        for (Student student1 : student1s){
            totalAge = student1.getAge() + totalAge;
        }
        return (totalAge*1.0f)/ student1s.size();
    }

    public int calculateTotalNumberOfStudents(){
        return student1s.size();
    }

}
