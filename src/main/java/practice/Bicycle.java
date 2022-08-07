package practice;

// This is the base class or parent class or super class
public class Bicycle {
    // The bicycle class has two fields/attributes
    public int gear;
    public int speed;

    // The bicycle has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // The bicycle class has this method to reduce the speed
    public void applyBrake(int decrement) {
        speed -= decrement; // speed = speed - decrement
    }

    // The bicycle class has this method to increase the speed
    public void speedUp(int increment) {
        speed += increment; // speed = speed + increment
    }

    // The bicycle class has this method to print the bicycle information
    public String printInfo() {
        return ("No of gears are " + gear + " speed of bicycle is " + speed);
    }
}
