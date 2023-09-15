package abstractfactory.component;

import abstractfactory.component.button.AndroidButton;
import abstractfactory.component.menu.AndroidMenu;

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
