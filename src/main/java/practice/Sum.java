package practice;

public class Sum {
    // Overloaded method called summation. It takes two int value to sum
    public int summation(int x, int y) {
        return (x + y);
    }
    // Overloaded method called summation. It takes three int value to sum
    public int summation(int x, int y, int z) {
        return (x + y + z);
    }

    public int summation(int x, int y, int z, int a) {
        return (x + y + z + a);
    }

    // Overloaded method called summation. It takes two double values to sum
    public double summation(double x, double y, double z) {
        return (x + y + z);
    }

    public float summation(float x, float y, float z) {
        return (x + y + z);
    }

    public String nameConcat(String firstName, String lastName) {
        return ("First Name is: " + firstName + " Last Name is: " + lastName);
    }

}
