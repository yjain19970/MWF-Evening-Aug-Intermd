package abstractfactory.component.furniture.coffeeTable;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        //TODO
    }
}
