package work3;

public class Duck extends Animal implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("duck swim");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }

    @Override
    void move() {
        System.out.println("duck move");
    }
}
