import java.util.*;
class Buyer {
    private String name;
    private ArrayList<Product> products;

    public Buyer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void listProducts() {
        System.out.println("Products in cart:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static double calculateTotal(ArrayList<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Receipt for " + name + ":");
        for (Product product : products) {
            System.out.println(product);
            product.warranty();
            if (product instanceof Portable) {
                ((Portable) product).weight();
            }
        }
        System.out.println("Total: " + calculateTotal(products));
    }
}