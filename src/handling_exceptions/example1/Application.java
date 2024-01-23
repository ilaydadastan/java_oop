package handling_exceptions.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("example.txt");
        Scanner readfile = new Scanner(file);
    }
}
