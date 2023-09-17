package abstractfactory.component;

public class Flutter {

    public void setTheme(){
        System.out.println("Setting theme in both ios and android..");
    }


    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUiFactoryForPlatform(platform);
    }
}
