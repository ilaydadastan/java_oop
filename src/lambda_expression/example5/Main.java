package lambda_expression.example5;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 46, 73, 98, 14);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Max: " + max);
        System.out.println("Min:" + min);

    }
}
