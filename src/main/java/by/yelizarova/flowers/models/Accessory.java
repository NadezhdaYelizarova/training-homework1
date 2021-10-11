package by.yelizarova.flowers.models;

public class Accessory {
    private final String accessoryName;
    private final double accessoryCost;

    public Accessory(String name, double cost) {
        this.accessoryName = name;
        this.accessoryCost = cost;
    }

    public double getAccessoryCost() {
        return accessoryCost;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "accessoryName='" + accessoryName + '\'' +
                ", accessoryCost=" + accessoryCost +
                '}';
    }
}
