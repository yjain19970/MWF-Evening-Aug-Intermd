package abstractfactory.component.furniture.factory;

import abstractfactory.component.furniture.chair.Chair;
import abstractfactory.component.furniture.chair.VictorianChair;
import abstractfactory.component.furniture.coffeeTable.CoffeeTable;
import abstractfactory.component.furniture.coffeeTable.VictorianCoffeeTable;
import abstractfactory.component.furniture.sofa.Sofa;
import abstractfactory.component.furniture.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        System.out.println("Created Victorian Chair");
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        System.out.println("Created Victorian CoffeeTable");
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Created Victorian Sofa");
        return new VictorianSofa();
    }
}
