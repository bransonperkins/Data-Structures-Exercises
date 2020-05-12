import java.util.HashMap;
import java.util.Scanner;

public class HashForEach {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        HashMap<String, Integer> nameAge = new HashMap<String, Integer>();
        HashMap<String, String> homeFav = new HashMap<String, String>();

        System.out.println("Enter your name:");
        String name = userInput.next();

        System.out.println("Enter your age:");
        Integer age = userInput.nextInt();

        nameAge.put(name, age);

        System.out.println("Enter your hometown?");
        String town = userInput.next();

        System.out.println("Enter your favorite food:");
        String favFood = userInput.next();

        homeFav.put(town, favFood);

        for (String intro : nameAge.keySet()) {
            System.out.print("This is " + intro + "\nthey are " + nameAge.get(intro) + "-years-old.\n");
        }
        for (String home : homeFav.keySet()) {
            System.out.print("They're from " + home + "\nand their favorite food is " + homeFav.get(home) + ".");
        }

        userInput.close();

    }
}