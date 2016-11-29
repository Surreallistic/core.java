package core.java.EqualMethod;

/**
 * Created by Surreallistic on 02.05.2016.
 */
class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}

class AppEqual {

    public static void main(String[] args) {

        Person per1 = new Person(3, "Joe");
        Person per2 = new Person(4, "Joe");

        System.out.println(per1.equals(per2));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1 == value2);

        Integer x1 = 2;
        Integer x2 = 2;

        System.out.println(x1.equals(x2));

        String text1 = "Hello";
        String text2 = "Helloaaa".substring(0, 5);

        System.out.println();
        System.out.println(text1 + " " + text2);

        System.out.println(text1.hashCode());
        System.out.println(text2.hashCode());
        System.out.println(per1.getClass());
        System.out.println(text1.equals(text2));


    }
}
