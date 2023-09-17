package abstractfactory.component.button;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changing size....");
    }
}
