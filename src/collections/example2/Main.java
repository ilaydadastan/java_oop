package collections.example2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("ilayda", "dastan", "05555555555");
        Person p2 = new Person("ahmet can", "kepenek", "05333333333");
        Person p3 = new Person("john", "doe", "05555555555");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(p1);
        phoneBook.addPerson(p2);
        phoneBook.addPerson(p3);
        System.out.println(phoneBook.getPersonStringMap());
        System.out.println(phoneBook.getPersonStringMap().get("ilayda"));
    }
}
