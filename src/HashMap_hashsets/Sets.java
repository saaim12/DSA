import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("After add(): " + set);

        // addAll()
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Mango");
        moreFruits.add("Orange");
        moreFruits.add("Banana"); // Duplicate
        set.addAll(moreFruits);
        System.out.println("After addAll(): " + set);

        // contains()
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // containsAll()
        Set<String> testContains = new HashSet<>(Arrays.asList("Apple", "Banana"));
        System.out.println("Contains all Apple & Banana? " + set.containsAll(testContains));

        // size()
        System.out.println("Size of set: " + set.size());

        // remove()
        set.remove("Mango");
        System.out.println("After remove('Mango'): " + set);

        // removeAll()
        Set<String> removeFruits = new HashSet<>(Arrays.asList("Cherry", "Orange"));
        set.removeAll(removeFruits);
        System.out.println("After removeAll(): " + set);

        // retainAll()
        Set<String> keepOnly = new HashSet<>();
        keepOnly.add("Banana");
        set.retainAll(keepOnly);
        System.out.println("After retainAll(): " + set);

        // isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // toArray()
        Object[] array = set.toArray();
        System.out.println("Array version: " + Arrays.toString(array));

        // iterator()
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // equals()
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Banana");
        System.out.println("Equals anotherSet? " + set.equals(anotherSet));

        // hashCode()
        System.out.println("Hash code: " + set.hashCode());

        // spliterator()
        System.out.println("Using spliterator:");
        Spliterator<String> spliterator = set.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
