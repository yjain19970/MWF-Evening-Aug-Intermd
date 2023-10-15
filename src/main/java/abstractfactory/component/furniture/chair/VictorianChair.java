package abstractfactory.component.furniture.chair;

public class VictorianChair implements Chair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        //TODO
    }
}
