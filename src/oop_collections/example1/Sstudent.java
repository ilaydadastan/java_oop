package oop_collections.example1;

import java.util.Objects;

public class Sstudent {

    private String name;
    private int no;

    public Sstudent(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Sstudent{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    @Override
    public boolean equals(Object sstudent) {

        return (this.getNo() == ((Sstudent)sstudent).getNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
