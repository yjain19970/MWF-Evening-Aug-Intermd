package abstractfactory.component.furniture;

import abstractfactory.component.furniture.factory.FurnitureAbstractFactory;

public class FurnitureFactory {
    private FurnitureAbstractFactory furnitureStore;

    public FurnitureFactory(FurnitureAbstractFactory store) {
        this.furnitureStore = store;
    }

    public FurnitureAbstractFactory getFurnitureStore(){
        return this.furnitureStore;
    }
}
