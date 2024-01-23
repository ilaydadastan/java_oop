package runtime_exceptions;

public class Application {

    public static void main(String[] args) {

        int value = 11;

        value = value / 0;


        String empty = null;

        System.out.println(empty.length());


        String[] numbers = {"one", "two", "three"};

        System.out.println(numbers[3]);

    }
}
