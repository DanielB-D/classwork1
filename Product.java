abstract class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(Product other) {
        this.name = other.name;
        this.price = other.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double calculateVAT() {
        return price * 0.17;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }

    public abstract void warranty();
}
