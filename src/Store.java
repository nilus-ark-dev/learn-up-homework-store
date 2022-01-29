import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Store {

    public static void printMap(Map<String, Product> store) {
        System.out.println("Текущий список товаров:");
        store.forEach((key, value) -> System.out.printf("Артикул: %s Товар: %s \n", key, value.getName()));
        System.out.println("Итого: " + store.size());
    }

    public static void sortMapByValue(List<Map.Entry<String, Product>> list) {
        list.sort(Comparator.comparing(o -> o.getValue().getName()));
    }

    public static void printSortedMap(List<Map.Entry<String, Product>> list) {
        System.out.println("\nОстаток товаров за прошедший месяц:");
        list.forEach(s-> System.out.println("Артикул: " + s.getKey() + " Товар: " + s.getValue().getName()));
        System.out.println("Итого: " + list.size());
    }
}
