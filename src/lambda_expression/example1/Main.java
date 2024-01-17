package lambda_expression.example1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sumOddNumbers = numbers.stream()
                .filter(n -> n%2!=0)
                .mapToInt(n -> n*n)
                .sum();

        int sumEvenNumbers = numbers.stream()
                .filter(n -> n%2==0)
                .mapToInt(n -> n*n)
                .sum();

        System.out.println("Sum of squares of odd numbers: " + sumOddNumbers);
        System.out.println("Sum of squares of even numbers: " + sumEvenNumbers);

    }
}
