import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ForEachAndMap {
    public static void main(String[] args) {

        // Ask the user for 5 numbers. Store them in an array list
        List<Integer> arrayListNums = new ArrayList<Integer>(5);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arrayListNums.add(userInput.nextInt());
        }
            
        // enhanced for loop to find the sum and product of the array list
        int sum = 0;
        int product = 1;
        for (int values : arrayListNums) {
            sum = sum += values;
            product = product * values;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        // find the smallest and largest numbers of the array list
        System.out.println("Largest number is " + Collections.max(arrayListNums));
        System.out.println("Smallest number is " + Collections.min(arrayListNums));

        //---------------------------------Car Dealer Exercise---------------------------------//

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> cars = new HashMap<>();
        cars.put("Impala", "Chevy");
        cars.put("Civic", "Honda");
        cars.put("Tacoma", "Toyota");
        cars.put("F-150", "Ford");
        cars.put("Soul", "Kia");
        cars.put("Pilot", "Honda");
        cars.put("Camry", "Toyota");
        
        System.out.println("What kind of car are you looking for?");
        String model = scanner.nextLine();

        while (model != null) {
            model = model.substring(0,1).toUpperCase() + model.substring(1).toLowerCase();
            if (cars.containsKey(model)) {
                String make = cars.get(model);
                System.out.printf("You're looking for a %s? Not a problem! Follow me to this lot to see our %s selection.", model, make);
                break;
            } else {
                System.out.println("Sorry we don't have the model you are looking for.");
                break;
            }
        }
            
        scanner.close();
            
        userInput.close();
    }
}