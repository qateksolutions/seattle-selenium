package practice;

public class MountainBike extends Bicycle{

    // The MountainBike has unique field to adjust seat height
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    // The MountainBike has unique operation/method to set the seat height
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Overriding printInfo method and add additional information to it
    public String printInfo() {
        return (super.printInfo() + " seat height is: " + seatHeight);
    }
}
