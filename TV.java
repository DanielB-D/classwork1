class TV extends Product {
    public TV(String name, int price) {
        super(name, price);
    }

    @Override
    public void warranty() {
        System.out.println("Warranty covers: screen and remote control");
    }

    @Override
    public String toString() {
        return "TV: " + super.toString();
    }
}

