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

        printMap(store);

        store.remove("M20215890N6");

        Set<Map.Entry<String, Product>> entrySet = store.entrySet();
        List<Map.Entry<String, Product>> list = new ArrayList<>(entrySet);

        sortMapByValue(list);

        printSortedMap(list);
    }

    public static void printMap(Map<String, Product> store) {
        System.out.println("Текущий список товаров:");
        store.forEach((key, value) -> System.out.printf("Артикул: %s Товар: %s \n", key, value.getName()));
    }

    public static void sortMapByValue(List<Map.Entry<String, Product>> list) {
        list.sort(Comparator.comparing(o -> o.getValue().getName()));
    }

    public static void printSortedMap(List<Map.Entry<String, Product>> list) {
        System.out.println("\nОстаток товаров за прошедший месяц:");
        list.forEach(s-> System.out.println("Артикул: " + s.getKey() + " Товар: " + s.getValue().getName()));
    }
}
