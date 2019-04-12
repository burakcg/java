package work3;

public class Fish extends Animal implements Swimmable{
    @Override
    public void swim() {
        System.out.println("fish swim");
    }

    @Override
    void move() {
        System.out.println("fish move");
    }
}
