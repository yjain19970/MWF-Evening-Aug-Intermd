package abstractfactory.component.icons.factory;

import abstractfactory.component.icons.button.Button;
import abstractfactory.component.icons.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
