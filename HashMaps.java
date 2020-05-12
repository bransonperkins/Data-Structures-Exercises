import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        // create new HashMap with String as the keys and Integer as the values
        HashMap<String, Integer> person = new HashMap<String, Integer>();
        person.put("Joan", 22);
        person.put("Daniel", 42);
        person.put("Anna", 34);
    
        //loop through the hash map and return each key/value pair
        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}