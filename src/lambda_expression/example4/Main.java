package lambda_expression.example4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(67d, 79d, 13d, 28d);
        double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }
}
