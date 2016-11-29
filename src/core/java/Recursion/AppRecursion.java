package core.java.Recursion;

/**
 * Created by Surreallistic on 03.05.2016.
 */
public class AppRecursion {

    public static void main(String[] args) {

        System.out.println(calculate(4));

    }

    private static int calculate(int value) {

        if (value == 1)
            return 1;

        return calculate(value - 1) * value;

    }
}

