package center.kit.runners.homework.lesson10;

import center.kit.app.homework.lesson10.Bicycle;
import center.kit.app.homework.lesson10.BicycleWithRing;
import center.kit.app.homework.lesson10.BicycleWithRingInterface;
import center.kit.app.homework.lesson10.CustomBicycle;

public class BicycleRunner {


    public static void main(String[] args) {

        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();

        Bicycle bicycle = new CustomBicycle();
        bicycle.setGear(5);
        bicycle.setSpeed(200);
    }
}
