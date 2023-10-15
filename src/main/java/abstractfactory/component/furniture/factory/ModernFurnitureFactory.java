package abstractfactory.component.furniture.factory;

import abstractfactory.component.furniture.chair.Chair;
import abstractfactory.component.furniture.chair.ModernChair;
import abstractfactory.component.furniture.coffeeTable.CoffeeTable;
import abstractfactory.component.furniture.coffeeTable.ModernCoffeeTable;
import abstractfactory.component.furniture.sofa.ModernSofa;
import abstractfactory.component.furniture.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        System.out.println("Created Modern Chair");
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        System.out.println("Created Modern CoffeeTable");
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Created Modern Sofa");
        return new ModernSofa();
    }
}
