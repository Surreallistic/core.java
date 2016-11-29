package core.java.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Surreallistic on 01.05.2016.
 */
public class Test {

    public void run() throws IOException, ParseException {

        throw new ParseException("Error in command list", 3);
    }
}
