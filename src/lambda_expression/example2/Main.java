package lambda_expression.example2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> keywords = Arrays.asList("glasses", "book", "notebook", "cream", "phone");

        String keywordToSearch = "book";
        Predicate<String> searchKeyword  = keyword -> keyword.equals(keywordToSearch);
        boolean compare = keywords.stream().anyMatch(searchKeyword);
        System.out.println(compare);
    }
}
