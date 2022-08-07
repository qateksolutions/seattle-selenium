package practice;

public class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: oink oink");
    }

    @Override
    public void run() {
        System.out.println("Sssshhhhhh");
    }
}
