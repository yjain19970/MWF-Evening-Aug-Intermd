package abstractfactory.component.icons;

import abstractfactory.component.icons.factory.AndroidFactory;
import abstractfactory.component.icons.factory.IoSFactory;
import abstractfactory.component.icons.factory.UIFactory;

public class UIFactoryFactory {
    // 99% of the classes you will use this practical design pattern
    public static UIFactory getUiFactoryForPlatform(Platform platform){
        if(platform.equals(Platform.ANDROID)){
            return new AndroidFactory();
        }else if(platform.equals(Platform.IOS)){
            return new IoSFactory();
        }
        return null;
    }
}
