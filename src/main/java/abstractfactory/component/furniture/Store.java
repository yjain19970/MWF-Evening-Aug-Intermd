package abstractfactory.component.furniture;

import abstractfactory.component.furniture.factory.FurnitureAbstractFactory;
import abstractfactory.component.furniture.factory.ModernFurnitureFactory;
import abstractfactory.component.furniture.factory.VictorianFurnitureFactory;

public class Store {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = new ModernFurnitureFactory();
        FurnitureAbstractFactory store = new FurnitureFactory(factory).getFurnitureStore();
        store.createChair();
        store.createCoffeeTable();
        store.createSofa();

        FurnitureAbstractFactory factory1 = new VictorianFurnitureFactory();
        FurnitureAbstractFactory store1 = new FurnitureFactory(factory1).getFurnitureStore();
        store1.createChair();
        store1.createCoffeeTable();
        store1.createSofa();
    }
}
