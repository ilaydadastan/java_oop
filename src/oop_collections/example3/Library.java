package oop_collections.example3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Library {
    private Map<String, Book> stringBookMap;

    public Map<String, Book> getStringBookMap() {
        return stringBookMap;
    }

    public void setStringBookMap(Map<String, Book> stringBookMap) {
        this.stringBookMap = stringBookMap;
    }

    public void saveBook(Book book) {
        if (stringBookMap == null) {
            stringBookMap = new TreeMap<>();
        }
        stringBookMap.put(book.getName(), book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "stringBookMap=" + stringBookMap +
                '}';
    }

    public Set<String> getKeysByValue(Book book) {
        Set<String> foundKeys = new HashSet<>();
        stringBookMap.forEach((key, value) -> {
            if (value.equals(book)) {
                foundKeys.add(key);
            }
        });
        /**
         for (Map.Entry<String, Book> stringBookEntry: stringBookMap.entrySet()) {
         if (stringBookEntry.getValue().equals(book)) {
         foundKeys.add(stringBookEntry.getKey());
         }
         }

         stringBookMap.entrySet().forEach(stringBookEntry -> {
         if (stringBookEntry.getValue().equals(book)) {
         foundKeys.add(stringBookEntry.getKey());
         }
         });
         **/
        return foundKeys;
    }
}
