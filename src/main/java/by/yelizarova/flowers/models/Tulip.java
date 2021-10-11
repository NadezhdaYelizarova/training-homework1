package by.yelizarova.flowers.models;

public class Tulip extends Flower {
    private final String name;

    public Tulip(String name, double cost, Freshness freshness, double length) {
        super(cost, freshness, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tulip " + name +
                super.toString();
    }
}
