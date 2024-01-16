package oop_collections.example2;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Person> personStringMap;

    public Map<String, Person> getPersonStringMap() {
        return personStringMap;
    }

    public void setPersonStringMap(Map<String, Person> personStringMap) {
        this.personStringMap = personStringMap;
    }

    public void addPerson(Person person){
        if (personStringMap == null) {
            personStringMap = new HashMap<>();
        }
        if (!personStringMap.values().contains(person)) {
            personStringMap.put(person.getFirstName(), person);
        }
    }
}
