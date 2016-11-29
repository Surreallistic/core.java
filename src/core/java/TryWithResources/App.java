package core.java.TryWithResources;

/**
 * Created by Surreallistic on 02.05.2016.
 */
class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing..");
        throw new Exception("Your PC is destroyed.. ");
    }

}

public class App {

    public static void main(String[] args) {

        try (Temp x = new Temp()) {



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
