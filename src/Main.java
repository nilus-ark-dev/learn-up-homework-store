import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> store = new ArrayList<>();

        Product milk = new Product("Молоко", "M20215890N2");
        Product eggs = new Product("Яйца", "M20215890N3");
        Product oil = new Product("Масло", "M20215890N4");
        Product water = new Product("Вода", "M20215890N5");
        Product bread = new Product("Хлеб", "M2021589N6");
        Product cheese = new Product("Сыр", "M2021589N7");

        store.add(milk);
        store.add(eggs);
        store.add(oil);
        store.add(water);
        store.add(bread);
        store.add(cheese);

        store.forEach(System.out::println);
        System.out.println("\nКоличество товаров " + store.size() + " позиций");

        if (store.contains(milk)) {
            System.out.println("\nХранилище содержит Молоко \n");
        }

        if (store.remove(oil)) {
            System.out.println("Из хранилища удален товар Масло \n");
        }

        store.sort(new ProductNameComparator());

        store.forEach(System.out::println);
        System.out.println("\nОстаток товаров " + store.size() + " позиций");
    }
}
