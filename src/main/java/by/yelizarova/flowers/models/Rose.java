package by.yelizarova.flowers.models;

public class Rose extends Flower {
    private String name;

    public Rose(String name, double cost, Freshness freshness, double length) {

        super(cost, freshness, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rose " + name +
                super.toString();
    }
}
