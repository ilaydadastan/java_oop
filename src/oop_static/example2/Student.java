package oop_static.example2;

public class Student {
    private final String name;
    private final String surname;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private int no;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
