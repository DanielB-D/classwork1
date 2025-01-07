class Laptop extends Computer implements Portable {
    public Laptop(String name, int price) {
        super(name, price);
    }

    @Override
    public double calculateVAT() {
        return getPrice() * 0.10;
    }

    @Override
    public void warranty() {
        System.out.println("Warranty covers: keyboard, screen, and battery");
    }

    @Override
    public String toString() {
        return "Laptop: " + super.toString();
    }

    @Override
    public void weight() {
        System.out.println("Weight: 2 kilograms");
    }
}
