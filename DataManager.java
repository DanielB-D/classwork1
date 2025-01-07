import java.util.*;
class DataManager {
    public static HashMap<Integer, Product> mockProducts() {
        HashMap<Integer, Product> products = new HashMap<>();
        products.put(1, new TV("Samsung 75", 5000));
        products.put(2, new TV("LG OLED", 4500));
        products.put(3, new Smartphone("Apple iPhone 16", 1000));
        products.put(4, new Smartphone("Samsung Galaxy S22", 950));
        products.put(5, new Laptop("Dell XPS 15", 1500));
        products.put(6, new Laptop("MacBook Pro", 2000));
        products.put(7, new PC("HP Pavilion", 1200));
        products.put(8, new PC("Lenovo ThinkCentre", 1100));
        return products;
    }
}

