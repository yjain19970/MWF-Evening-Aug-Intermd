package abstractfactory.component.icons.factory;

import abstractfactory.component.icons.button.AndroidButton;
import abstractfactory.component.icons.factory.UIFactory;
import abstractfactory.component.icons.menu.AndroidMenu;

public class AndroidFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
