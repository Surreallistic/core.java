package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Surreallistic on 08.05.2016.
 */
public class ReadObjects {

    public static void main(String[] args) {

        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin"))) {

            Person johnSnow = (Person) os.readObject();

            System.out.println(johnSnow);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
