package collections.example1;

import java.util.HashSet;
import java.util.Set;

public class School {
    private Set<Sstudent> sstudents;

    public Set<Sstudent> getStudents() {
        return sstudents;
    }

    public void setStudents(Set<Sstudent> sstudents) {
        this.sstudents = sstudents;
    }

    public void addStudent(Sstudent sstudent) {
        if (sstudents == null) {
            sstudents = new HashSet<>();
        }
        sstudents.add(sstudent);
    }
}
