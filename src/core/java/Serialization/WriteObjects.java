package core.java.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Surreallistic on 08.05.2016.
 */
public class WriteObjects {

    public static void main(String[] args) {

        try ( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin")) ) {

            Person ppl = new Person(1, "John Snow");
            Person.setCount(2);
            os.writeObject(ppl);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
