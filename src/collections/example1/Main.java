package collections.example1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Sstudent s1 = new Sstudent("ilayda", 1234);
        Sstudent s2 = new Sstudent("ahmet can", 85402);
        Sstudent s3 = new Sstudent("john", 1234);
        Sstudent s4 = new Sstudent("ilayda", 1234);
        School school = new School();
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);
        System.out.println(school.getStudents());
        System.out.println(s1.equals(s4));
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());

        Map<Sstudent, Integer> sstudentIntegerMap = new HashMap<>();
        sstudentIntegerMap.put(s1, 111);
        sstudentIntegerMap.put(s2, 222);
        sstudentIntegerMap.put(s3, 333);
        sstudentIntegerMap.put(s4, 444);
        sstudentIntegerMap.put(null, 444);
        sstudentIntegerMap.put(null, 555);

        System.out.println(sstudentIntegerMap);
        System.out.println(sstudentIntegerMap.keySet());
        System.out.println(sstudentIntegerMap.values());


    }
}
