package core.java.Interfaces;

/**
 * Created by Surreallistic on 24.04.2016.
 */
public class AppInterface {

    public static void main(String[] args) {

        Machine machin1 = new Machine();
        machin1.start();

        Person per1 = new Person("Nick");
        per1.greet();

//        System.out.println();
        Info info1 = new Machine();
        info1.showInfo();

        machin1.showInfo();

        Machine machine2 = new Machine();
        machine2.showInfo();
//
//        Info info2 = per1;
//        info2.showInfo();
//
//        outputInfo(machin1);
//        outputInfo(per1);

    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }

}
