package oop_static.example2;


public class Main {

    public static void main(String[] args) {
        SchoolClass schoolClass1 = new SchoolClass();
        schoolClass1.addStudent(new Student("ilayda", "dastan", 23));
        schoolClass1.addStudent(new Student("ahmet can", "kepenek", 32));

        System.out.println(schoolClass1.calculateTotalNumberOfStudents());
        System.out.println(schoolClass1.calculateNumberOfStudentsStartsWith("a"));
        System.out.println(schoolClass1.getAverageAge());
        System.out.println(schoolClass1.getStudents().get(0).getNo());
        System.out.println(schoolClass1.getStudents().get(1).getNo());
        System.out.println(schoolClass1.getStudents().get(1).getName());


    }
}
