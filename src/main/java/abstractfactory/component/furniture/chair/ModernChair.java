package abstractfactory.component.furniture.chair;

public class ModernChair implements Chair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        //TODO
    }
}
