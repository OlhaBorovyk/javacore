package center.kit.app.homework.lesson10;

public class CustomBicycle extends Bicycle implements BicycleWithRingInterface {

    int speed;
    int gear;

    public CustomBicycle() {
        ring();
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println(gear);
    }

    @Override
    public void ring() {
        System.out.println("Wshhhh!");
    }
}
