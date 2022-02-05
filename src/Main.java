import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Product> storageOfGoods = new HashMap<>();

        storageOfGoods.put("M20215890N2", new Product("Milk"));
        storageOfGoods.put("M20215890N3", new Product("Bread"));
        storageOfGoods.put("M20215890N4", new Product("Oil"));
        storageOfGoods.put("M20215890N5", new Product("Water"));
        storageOfGoods.put("M20215890N6", new Product("Eggs"));
        storageOfGoods.put("M20215890N7", new Product("Cheese"));

        Store store = new Store();
        store.printMap(storageOfGoods);

        storageOfGoods.remove("M20215890N6");

        Set<Map.Entry<String, Product>> entrySet = storageOfGoods.entrySet();
        List<Map.Entry<String, Product>> list = new ArrayList<>(entrySet);

        store.sortMapByValue(list);

        store.printSortedMap(list);
    }
}
