package core.java.ReadFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Surreallistic on 30.04.2016.
 */
public class AppRead {

    public static void main(String[] args) throws FileNotFoundException {


        String file = "xx.txt";

        File file1 = new File(file);

        Scanner in = new Scanner(file1);

        int firstLine = in.nextInt();
        in.nextLine();
        int count = 2;

        while (in.hasNext()) {
            String temp = in.nextLine();

            System.out.println(count + ": " + temp);
            count++;
        }

    }
}
