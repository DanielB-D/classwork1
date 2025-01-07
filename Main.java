import java.util.*;
public class Main {
    private static HashMap<Integer, Product> productMap;

    public static void main(String[] args) {
        productMap = DataManager.mockProducts();
        startOrder();
    }

    public static void startOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Buyer buyer = new Buyer(name);

        while (true) {
            System.out.println("What product would you like to purchase?");
            System.out.println();
            for (Integer id : productMap.keySet()) {
                System.out.println(id + ". " + productMap.get(id));
            }
            System.out.println();
            System.out.print("Enter product ID (or 0 to finish): ");
            int productId = scanner.nextInt();
            System.out.println();

            if (productId == 0) break;

            if (productMap.containsKey(productId)) {
                Product product = productMap.get(productId);
                buyer.addProduct(new Product(product) {
                    @Override
                    public void warranty() {
                        product.warranty();
                    }
                });
            } else {
                System.out.println("Invalid product ID.");
            }
        }

        System.out.print("Enter coupon code (or press Enter to skip): ");
        scanner.nextLine();
        System.out.println();
        String coupon = scanner.nextLine();
        if ("HOLIDAY30".equals(coupon)) {
            ArrayList<String> discountedProducts = new ArrayList<>();
            for (Product product : buyer.getProducts()) {
                if (!discountedProducts.contains(product.getName())) {
                    product.setPrice((int) (product.getPrice() * 0.7));
                    discountedProducts.add(product.getName());
                }
            }
        }

        buyer.printReceipt();
    }
}
