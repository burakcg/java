package work2;

abstract public class Pet {

    public enum Color{
        RED,
        BLUE,
        BLACK,
        WHITE,
    }

    public int age;
    public Color color;

    protected String name;
    protected double weight;

    public Pet(String name, int age, Color color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void eat() {
        this.weight++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deneme(){
        System.out.println("Pet Deneme");
    }

}
