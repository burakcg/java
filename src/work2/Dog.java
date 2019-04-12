package work2;

public class Dog extends Pet {

    public enum Breed {
        KANGAL("Woh Woh"),
        GOLDEN("Hev Hev"),
        DOGO("Hov Hov");

        private final String barkStyle;

        Breed(String barkStyle) {
            this.barkStyle = barkStyle;
        }

        public String getBarkStyle() {
            return this.barkStyle;
        }

    }

    public Breed breed;

    public Dog(String name, int age, Color color, double weight, Dog.Breed breed) {
        super(name, age, color, weight);
        this.breed = breed;
    }

    public void eat(){
        this.weight += 2;
    }

    public void bark() {
        System.out.println(this.breed.getBarkStyle());
    }

    public String goodBoy() {
        return "Good Boy "+this.name;
    }

    public void deneme(){
        System.out.println("Dog Deneme");
    }

}
