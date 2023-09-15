package abstractfactory.component;

import abstractfactory.component.button.Button;
import abstractfactory.component.button.IosButton;
import abstractfactory.component.menu.IosMenu;
import abstractfactory.component.menu.Menu;

public class IoSFactory implements UIFactory {
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
