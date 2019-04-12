package work2;

public class Cat extends Pet {

    public enum Breed {
        BURMESE("miv miv"),
        BENGAL("mav mav"),
        TEKIR("mev mev");

        private final String meawStyle;

        Breed(String meawStyle) {
            this.meawStyle = meawStyle;
        }

        public String getMeawStyle() {
            return this.meawStyle;
        }

    }

    public Breed breed;

    public Cat(String name, int age, Color color, double weight, Cat.Breed breed) {
        super(name, age, color, weight);
        this.breed = breed;
    }

    public void meaw()
    {
        System.out.println(this.breed.getMeawStyle());
    }

}
