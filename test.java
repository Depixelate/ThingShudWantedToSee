import java.util.*;
class Test {
    public static void main(String[] args) {
        // Create a TreeMap with reversed order of keys.
        var treeMap = new TreeMap<String, Integer>(Comparator.reverseOrder());

        // Add some elements to the TreeMap
        treeMap.put("First Number", 56);
        treeMap.put("Second Number", 98);
        treeMap.put("Third Number", 156);

        System.out.println(treeMap);

        // Print Second Number
        System.out.println(treeMap.get("Second Number"));

        // Remove Third Number
        treeMap.remove("Third Number");

        // Create a temporary map, add all the keys to treeMap
        treeMap.putAll(Map.of(
            "1", 1,
            "2", 2,
            "3", 3
        ));

        System.out.println(treeMap);

        // print out keys, values, and entries separately
        var keys = treeMap.keySet();
        var values = treeMap.values();
        var entries = treeMap.entrySet();

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);

        // Print if map contains keys and values "1", "Third Number", 98, 3
        System.out.println(treeMap.containsKey("1"));
        System.out.println(treeMap.containsKey("Third Number"));
        System.out.println(treeMap.containsValue(98));
        System.out.println(treeMap.containsValue(3));

        // Print size of Map, check if empty, remove all data, check if empty again
        System.out.println("Size: " + treeMap.size());
        System.out.println("Is empty: " + treeMap.isEmpty());
        treeMap.clear();
        System.out.println("Is empty: " + treeMap.isEmpty());
    }
}
