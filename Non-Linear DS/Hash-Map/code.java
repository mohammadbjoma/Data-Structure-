import java.util.HashMap;

class HashMapOperations {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // INSERT
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // TRAVERSE
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // SEARCH
        System.out.println("Search Bob: " + map.containsKey("Bob"));

        // DELETE
        map.remove("Alice");
        System.out.println("After deleting Alice: " + map);

        // COUNT
        System.out.println("Size: " + map.size());
    }
}
