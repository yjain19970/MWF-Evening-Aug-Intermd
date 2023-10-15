package abstractfactory.component.icons;

import abstractfactory.component.icons.button.Button;
import abstractfactory.component.icons.factory.UIFactory;

public class Client {
    public static void main(String[] args) {
        //Flutter flutter = new Flutter(new AndroidFactory());
        Flutter flutter = new Flutter();
        UIFactory af =  flutter.createUIFactory(Platform.IOS);
        Button b =  af.createButton(); // AndroidButton
        b.changeSize();

    }
}
