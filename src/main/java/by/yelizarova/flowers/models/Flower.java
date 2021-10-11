package by.yelizarova.flowers.models;

public abstract class Flower {
    private final double cost;
    private final Freshness freshness;
    private final double length;

    public Flower(double cost, Freshness freshness, double length) {
        this.cost = cost;
        this.freshness = freshness;
        this.length = length;
    }

    public double getCost() {
        return cost;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "{" + "cost=" + cost +
                ", freshness=" + freshness +
                ", length=" + length +
                '}';
    }
}
