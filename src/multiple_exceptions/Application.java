package multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {
    public static void main(String[] args) {
        MultipleExceptions me = new MultipleExceptions();

        try {
            me.start();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            me.example();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
