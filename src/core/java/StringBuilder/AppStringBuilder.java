package core.java.StringBuilder;

/**
 * Created by Surreallistic on 23.04.2016.
 */
public class AppStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // It's more memory efficient

        sb.append("Hello my name is Jack. I'm a ");
        sb.append(122);
        sb.append(" years old. Guess what I don't care.");

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("");

        sb1.append("String one is here ")
                .append("and continuing here ")
                .append("also here.");

        System.out.println(sb1.toString());

        //advanced String

        System.out.println("tab \t and \n new line");

        System.out.printf("Starts:%5dSTOPS ", 50000000);

        System.out.println();

        System.out.printf("dasd %11.250f", 5.6);


    }
}
