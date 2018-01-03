package center.kit.app.homework.lesson10;

public abstract class Bicycle {

    public Bicycle() {
        ride();
    }

    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);
}
