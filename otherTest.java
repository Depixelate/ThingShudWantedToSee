import java.util.*;
public class otherTest {
    public static void main(String[] args) {
        //Create TreeMap from other Map Efficiently
        var treeMap = new TreeMap<String, Integer>(Map.of("magic", 3,"age", 19,"life", 42));
        
        // Get Iterator for entries(use full types)
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();

        // Code to Iterate through all the entries, 
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            //print out key, value, separately, set value to 0
            String key = entry.getKey();
            int value = entry.getValue();
            entry.setValue(0);
            System.out.printf("key=%s value=%s\n", key, value);

            // if original value odd remove from Map
            if(value % 2 == 1) {
                iterator.remove();
            }
        }

        System.out.printf("New Map: %s\n", treeMap);
    }
}
