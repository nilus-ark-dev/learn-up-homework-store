import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Store {

    public void printMap(Map<String, Product> storageOfGoods) {
        System.out.println("Текущий список товаров:");
        storageOfGoods.forEach((key, value) -> System.out.printf("Артикул: %s Товар: %s \n", key, value.getName()));
        System.out.println("Итого: " + storageOfGoods.size());
    }

    public void sortMapByValue(List<Map.Entry<String, Product>> list) {
        list.sort(Comparator.comparing(o -> o.getValue().getName()));
    }

    public void printSortedMap(List<Map.Entry<String, Product>> list) {
        System.out.println("\nОстаток товаров за прошедший месяц:");
        list.forEach(s-> System.out.println("Артикул: " + s.getKey() + " Товар: " + s.getValue().getName()));
        System.out.println("Итого: " + list.size());
    }
}
