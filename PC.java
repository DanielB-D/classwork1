class PC extends Computer {
    public PC(String name, int price) {
        super(name, price);
    }

    @Override
    public void warranty() {
        System.out.println("Warranty covers: motherboard and power supply");
    }

    @Override
    public String toString() {
        return "PC: " + super.toString();
    }
}

