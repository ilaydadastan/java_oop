package collections.example2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String telNo;

    public Person(String firstName, String lastName, String telNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", telNo=" + telNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return telNo.equals(person.telNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telNo);
    }
}
