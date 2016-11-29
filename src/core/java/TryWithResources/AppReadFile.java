package core.java.TryWithResources;

import java.io.*;

/**
 * Created by Surreallistic on 02.05.2016.
 */
public class AppReadFile {

    public static void main(String[] args) {

        File file = new File("NewXX.txt");

        try( BufferedWriter br = new BufferedWriter(new FileWriter(file)) ) {

            br.write("Hello world. \nSecond Line.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
