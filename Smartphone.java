class Smartphone extends Product implements Portable {
    public Smartphone(String name, int price) {
        super(name, price);
    }

    @Override
    public void warranty() {
        System.out.println("Warranty covers: screen and battery");
    }

    @Override
    public String toString() {
        return "Smartphone: " + super.toString();
    }

    @Override
    public void weight() {
        System.out.println("Weight: 200 grams");
    }
}
