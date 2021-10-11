package by.yelizarova.flowers.service;

import by.yelizarova.flowers.models.*;

public class App {
    public static void main(String[] args) {
        Flower rose1 = new Rose("red rose", 3.5, Freshness.HIGH, 35);
        Flower rose2 = new Rose("white rose", 5, Freshness.MIDDLE, 40);
        Flower tulip = new Tulip("pink tulip", 2.5, Freshness.HIGH, 30);
        Flower lily = new Lily("yellow lily", 5.2, Freshness.LOW, 45);
        Flower chamomile = new Chamomile("simple chamomile", 3, Freshness.MIDDLE, 40);
        Accessory ribbon = new Accessory("ribbon", 1.5);
        Accessory wrapper = new Accessory("wrapper", 2);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose1).addFlower(rose2).addFlower(tulip).addFlower(lily).addFlower(chamomile);
        bouquet.addAccessory(ribbon).addAccessory(wrapper);

        System.out.println("bouquet price: " + bouquet.getPrice());

        bouquet.sortByFreshness();
        System.out.println(bouquet);
        System.out.println(bouquet.findFlowersFromStemDiapason(30, 45).toString());
    }
}
