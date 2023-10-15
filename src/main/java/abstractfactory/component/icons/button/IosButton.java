package abstractfactory.component.icons.button;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("ios button");
    }
}
