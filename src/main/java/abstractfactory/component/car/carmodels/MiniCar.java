package abstractfactory.component.car.carmodels;

import abstractfactory.component.car.Car;
import abstractfactory.component.car.CarType;
import abstractfactory.component.car.ICar;
import abstractfactory.component.car.Location;

public class MiniCar extends Car implements ICar {
    public MiniCar(Location location){
        super(CarType.MINI, location);
        construct();
    }
    @Override
    public void construct() {
        System.out.println("connecting to mini car");
    }
}
