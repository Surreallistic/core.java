package core.java.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class AppException {

    public static void main(String[] args) {

        try {
            Thread.sleep(100/0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static void openFile() throws FileNotFoundException, IOException {
        throw new FileNotFoundException();
        //File file = new File("xd.txt");
        //FileReader readFile = new FileReader(file);
    }
}
