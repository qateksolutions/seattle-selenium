package practice;

public class Encapsulate {
    // private variables declared those can only be accessed by public methods of the class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    public int getAge() {
        return geekAge;
    }

    // get method for name to access
    public String getName() {
        return geekName;
    }

    // get method for roll to access
    public int getRoll() {
        return geekRoll;
    }

    // set method for age to set value
    public void setAge(int newAge) {
        geekAge = newAge;
    }

    // set method for name to set value
    public void setName(String newName) {
        geekName = newName;
    }

    // set method for roll to set value
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}
