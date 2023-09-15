package abstractfactory.component;

import abstractfactory.component.button.Button;
import abstractfactory.component.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
