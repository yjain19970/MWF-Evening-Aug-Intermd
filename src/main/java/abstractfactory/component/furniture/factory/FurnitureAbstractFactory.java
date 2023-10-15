package abstractfactory.component.furniture.factory;

import abstractfactory.component.furniture.chair.Chair;
import abstractfactory.component.furniture.coffeeTable.CoffeeTable;
import abstractfactory.component.furniture.sofa.Sofa;

public interface FurnitureAbstractFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();

}
