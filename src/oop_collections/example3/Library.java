package oop_collections.example3;

import java.util.Map;
import java.util.TreeMap;

public class Library {
    private Map<String, Book> stringBookMap;

    public Map<String, Book> getStringBookMap() {
        return stringBookMap;
    }

    public void setStringBookMap(Map<String, Book> stringBookMap) {
        this.stringBookMap = stringBookMap;
    }

    public void saveBook(Book book){
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
}
