package abstractfactory.component.furniture.coffeeTable;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        //TODO
    }
}
