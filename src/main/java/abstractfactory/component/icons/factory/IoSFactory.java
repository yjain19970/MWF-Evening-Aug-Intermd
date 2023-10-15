package abstractfactory.component.icons.factory;

import abstractfactory.component.icons.button.IosButton;
import abstractfactory.component.icons.factory.UIFactory;
import abstractfactory.component.icons.menu.IosMenu;

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
