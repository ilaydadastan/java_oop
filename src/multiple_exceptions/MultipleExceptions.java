package multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
    public void start() throws IOException, ParseException {
        throw new ParseException("Error at line 10", 2);
    }

    public void example() throws IOException {
    }
}