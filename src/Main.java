import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Product> store = new HashMap<>();

        store.put("M20215890N2", new Product("Milk"));
        store.put("M20215890N3", new Product("Bread"));
        store.put("M20215890N4", new Product("Oil"));
        store.put("M20215890N5", new Product("Water"));
        store.put("M20215890N6", new Product("Eggs"));
        store.put("M20215890N7", new Product("Cheese"));

        Store.printMap(store);

        store.remove("M20215890N6");

        Set<Map.Entry<String, Product>> entrySet = store.entrySet();
        List<Map.Entry<String, Product>> list = new ArrayList<>(entrySet);

        Store.sortMapByValue(list);

        Store.printSortedMap(list);
    }
}
