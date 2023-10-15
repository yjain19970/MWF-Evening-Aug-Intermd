package abstractfactory.component.car.carmodels;

import abstractfactory.component.car.Car;
import abstractfactory.component.car.CarType;
import abstractfactory.component.car.ICar;
import abstractfactory.component.car.Location;

public class SedanCar extends Car implements ICar {
    public SedanCar(Location location){
        super(CarType.SEDAN,location);
        construct();
    }
    @Override
    public void construct() {
        System.out.println("connecting to sedan car");
    }
}
