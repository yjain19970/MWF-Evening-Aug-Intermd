package abstractfactory.component;

import abstractfactory.component.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory af =  flutter.createUIFactory("ios");
        Button b =  af.createButton(); // AndroidButton
        b.changeSize();

    }
}
