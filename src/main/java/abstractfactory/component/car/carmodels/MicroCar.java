package abstractfactory.component.car.carmodels;

import abstractfactory.component.car.Car;
import abstractfactory.component.car.CarType;
import abstractfactory.component.car.ICar;
import abstractfactory.component.car.Location;

public class MicroCar extends Car implements ICar {
    public MicroCar(Location location){
        super(CarType.MICRO, location);
        construct();
    }
    @Override
    public void construct() {
        System.out.println("constructing to micro car");
    }
}
