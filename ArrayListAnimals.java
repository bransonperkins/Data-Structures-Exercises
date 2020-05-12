import java.util.ArrayList;

public class ArrayListAnimals {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("zebra");
        animals.add("giraffe");
        animals.add("tiger");
        animals.add("elephant");
        animals.add("gorilla");

        for (String e : animals) {
            System.out.println(e);
        }

        String faveAnimal = "tiger";
        if (animals.contains(faveAnimal)) {
            System.out.printf("I love %ss!\n", faveAnimal);
        } else {
            System.out.println("No, I don't care for those.");
        }

        // forEach() method
        animals.forEach((s) -> print(s));
    }

    public static void print(String s) {
        System.out.println("Animal is " + s);
    }
}