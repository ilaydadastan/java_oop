package collections.example3;


import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("A Tale of Two Cities", "Charles Dickens", 333);
        Book b2 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 222);
        Book b3 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 111);
        Library l1 = new Library();
        l1.saveBook(b1);
        l1.saveBook(b2);
        l1.saveBook(b3);
        System.out.println(l1.getStringBookMap().values());
        System.out.println(l1.getStringBookMap().keySet());
        System.out.println(l1);

        System.out.println(l1.getKeysByValue(b1));

        Predicate<Book> bookPredicate = book -> book.getName().toLowerCase().startsWith("h");
        l1.getStringBookMap().values().stream()
                .filter(bookPredicate)
                .forEach(System.out::println);
    }

}
