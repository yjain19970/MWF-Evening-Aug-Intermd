package abstractfactory.component.icons;

import abstractfactory.component.icons.factory.UIFactory;

public class Flutter {
    /*
     * private UIFactory factory = null;
     */

    /*
     * public Flutter(UIFactory factory){
     *      this.factory = factory;
     * }
    */

    public UIFactory createUIFactory(Platform platform){
        return UIFactoryFactory.getUiFactoryForPlatform(platform);
    }

    /*
     * public UIFactory createUIFactory(Platform platform){
     *      if(platform.equals(Platform.ANDROID)){
     *          return new AndroidFactory();
     *      }else if(platform.equals(Platform.IOS)){
     *          return new IOSFactory();
     *      }
     *      return null;
     * }
     */

    /*
     * public void createUIFactory(UIFactory factory){
     *      this.factory = factory;
     * }
     *
     * public UIFactory getFactory(){
     *     return this.factory;
     * }
     *
     */
}
