package core.java.Enum;

/**
 * Created by Surreallistic on 03.05.2016.
 */
public class AppEnum {

    public static void main(String[] args) {

        Animal animal1 = Animal.CAT;

        switch (animal1) {
            case CAT:
                System.out.println("Cat.");
                break;
            case DOG:
                System.out.println("Dog.");
                break;
            case MOUSE:
                System.out.println("Mouse.");
                break;
        }

        System.out.println(Animal.DOG);

        System.out.println(Animal.MOUSE.name());

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof  Animal);

        System.out.println(Animal.MOUSE.toString());

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2.name());
    }
}
