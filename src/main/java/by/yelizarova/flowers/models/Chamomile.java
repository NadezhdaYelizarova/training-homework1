package by.yelizarova.flowers.models;

public class Chamomile extends Flower {
    private final String name;

    public Chamomile(String name, double cost, Freshness freshness, double length) {
        super(cost, freshness, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chamomile " + name +
                super.toString();
    }
}
