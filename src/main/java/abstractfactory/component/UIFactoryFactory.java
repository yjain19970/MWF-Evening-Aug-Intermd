package abstractfactory.component;

public class UIFactoryFactory {
    // 99% of the classes you will use this.
    public static UIFactory getUiFactoryForPlatform(String platform){
        if(platform.equals("android")){
            return new AndroidFactory();
        }else if(platform.equals("ios")){
            return new IoSFactory();
        }
        return null;
    }
}
