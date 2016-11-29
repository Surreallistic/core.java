package core.java.ReadFilesFileReader;

import java.io.*;

/**
 * Created by Surreallistic on 02.05.2016.
 */
public class AppReadFile {

    public static void main(String[] args) {

        File file = new File("xx.txt");

        try {
            FileReader readFile = new FileReader(file);
            BufferedReader br = new BufferedReader(readFile);

            StringBuilder writeLine = new StringBuilder();
            String line;

            while( (line = br.readLine()) != null) {
                writeLine.append(line);
                writeLine.append(System.lineSeparator());
            }

            System.out.println(writeLine);
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. File: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
        finally {

        }

    }
}
