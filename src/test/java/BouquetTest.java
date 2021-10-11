import by.yelizarova.flowers.models.Accessory;
import by.yelizarova.flowers.service.Bouquet;
import by.yelizarova.flowers.models.Freshness;
import by.yelizarova.flowers.models.Flower;
import by.yelizarova.flowers.models.Lily;
import by.yelizarova.flowers.models.Rose;
import by.yelizarova.flowers.models.Tulip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;


public class BouquetTest {


    @Test
    public void testAddFlowerAndAccessory() {
        Bouquet bouquet = new Bouquet();

        Flower rose = new Rose("white rose", 5, Freshness.MIDDLE, 40);
        Flower tulip = new Tulip("pink tulip", 2.5, Freshness.HIGH, 30);
        Flower lily = new Lily("yellow lily", 5.2, Freshness.LOW, 45);
        Accessory wrapper = new Accessory("wrapper", 2);

        bouquet.addFlower(rose).addFlower(tulip).addFlower(lily).addAccessory(wrapper);

        Assertions.assertEquals(4, bouquet.getFlowers().size() + bouquet.getAccessories().size());

    }

    @Test
    public void testGetPrice() {
        Bouquet bouquet = new Bouquet();
        Flower lily = new Lily("yellow lily", 5.2, Freshness.LOW, 45);
        Accessory wrapper = new Accessory("wrapper", 2);
        bouquet.addFlower(lily).addAccessory(wrapper);
        Assertions.assertEquals(7.2, bouquet.getPrice());

    }

    @Test
    public void testSortByFreshness() {

        Bouquet bouquet = new Bouquet();

        Flower rose = new Rose("white rose", 5, Freshness.MIDDLE, 40);
        Flower tulip = new Tulip("pink tulip", 2.5, Freshness.HIGH, 30);
        Flower lily = new Lily("yellow lily", 5.2, Freshness.LOW, 45);
        bouquet.addFlower(rose).addFlower(tulip).addFlower(lily);
        bouquet.sortByFreshness();
        Bouquet sorted = new Bouquet();
        sorted.addFlower(tulip).addFlower(rose).addFlower(lily);

        Assertions.assertEquals(sorted, bouquet);
    }

    @Test
    public void testFindFlowersFromStemDiapason() {
        Bouquet bouquet = new Bouquet();

        Flower rose = new Rose("white rose", 5, Freshness.MIDDLE, 40);
        Flower tulip = new Tulip("pink tulip", 2.5, Freshness.HIGH, 30);
        Flower lily = new Lily("yellow lily", 5.2, Freshness.LOW, 45);

        bouquet.addFlower(rose).addFlower(tulip).addFlower(lily);
        List<Flower> result = bouquet.findFlowersFromStemDiapason(29, 44);

        if (result.contains(lily)) {
            fail();
        }
        Assertions.assertEquals(2, result.size());

    }
}
