package by.yelizarova.flowers.service;

import by.yelizarova.flowers.models.Accessory;
import by.yelizarova.flowers.models.Flower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Bouquet {
    private double price;
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(Bouquet.class);

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public double getPrice() {
        return price;
    }

    public Bouquet addFlower(Flower flower) {
        price += flower.getCost();
        flowers.add(flower);
        LOGGER.info("flower {} added", flower);
        return this;
    }

    public Bouquet addAccessory(Accessory accessory) {
        price += accessory.getAccessoryCost();
        accessories.add(accessory);
        LOGGER.info("accessory {} added", accessory);
        return this;
    }

    public void sortByFreshness() {
        flowers.sort(new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.getFreshness().compareTo(o2.getFreshness());
            }
        });
        LOGGER.info("flowers sorted by freshness");
    }

    public List<Flower> findFlowersFromStemDiapason(double bottom, double top) {

        List<Flower> result = new ArrayList<>();
        for (Flower fl :
                flowers) {
            if (fl.getLength() >= bottom && fl.getLength() <= top) {
                result.add(fl);
            }
        }

        if (result.isEmpty()) {
            LOGGER.warn("flowers with length from {} to {} not found", bottom, top);
            return result;
        }
        LOGGER.info("flowers with length from {} to {} found: {}", bottom, top, result);
        return result;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "price=" + price +
                ", flowers=" + flowers +
                ", accessory=" + accessories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Double.compare(bouquet.price, price) == 0 && Objects.equals(flowers, bouquet.flowers) && Objects.equals(accessories, bouquet.accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, flowers, accessories);
    }
}
