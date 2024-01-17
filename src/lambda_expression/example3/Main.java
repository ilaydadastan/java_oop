package lambda_expression.example3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("ilayda", "irem", "ahmet", "hulya", "ceren", "mehmet");
        students.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println();

        for (String str : students) {
            System.out.println(str);
        }
    }
}
