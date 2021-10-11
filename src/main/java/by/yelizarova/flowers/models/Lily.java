package by.yelizarova.flowers.models;

public class Lily extends Flower {
    private final String name;

    public Lily(String name, double cost, Freshness freshness, double length) {
        super(cost, freshness, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lily " + name +
                super.toString();
    }
}
