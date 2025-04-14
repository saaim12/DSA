package HashMap_hashsets;

import java.util.HashMap;
import java.util.Map;

public class HasHMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial map: " + map);
        System.out.println("if we return a map like map.values() it gives array list : "+map.values()+"class: "+map.values().getClass()+"name :"+map.values().getClass().getTypeName());
        // putIfAbsent()
        map.putIfAbsent(2, "Blueberry"); // won't overwrite
        map.putIfAbsent(4, "Date"); // will add
        System.out.println("After putIfAbsent: " + map);

        // getOrDefault()
        System.out.println("Value for key 5 (default): " + map.getOrDefault(5, "Not Found"));

        // replace()
        map.replace(1, "Apricot");
        map.replace(2, "Banana", "Blackberry"); // only replaces if value matches
        System.out.println("After replace: " + map);

        // containsKey() and containsValue()
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Cherry'? " + map.containsValue("Cherry"));

        // remove()
        map.remove(3);
        map.remove(4, "WrongValue"); // won't remove
        map.remove(4, "Date"); // will remove
        System.out.println("After removals: " + map);

        // compute()
        map.compute(1, (key, val) -> val + " Pie");
        System.out.println("After compute: " + map);

        // computeIfAbsent()
        map.computeIfAbsent(5, key -> "Elderberry");
        System.out.println("After computeIfAbsent: " + map);

        // computeIfPresent()
        map.computeIfPresent(5, (key, val) -> val.toUpperCase());
        System.out.println("After computeIfPresent: " + map);

        // merge()
        map.merge(1, " Topping", (oldVal, newVal) -> oldVal + newVal);
        map.merge(6, "Fig", (oldVal, newVal) -> oldVal + newVal); // adds new if absent
        System.out.println("After merge: " + map);

        // Traversal
        System.out.println("\nEntry Set Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Size and isEmpty()
        System.out.println("Map size: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
