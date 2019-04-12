package work;

public class Cat {

    public enum Breed {
        BURMESE,
        BENGAL,
        TEKIR,
    }

    public int age;
    public Breed breed;
    public String color;

    public Cat() {
        System.out.println("Boş bir köpek oluşturuldu!");
    }

    public Cat(Breed breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;

        System.out.println(this.breed+" Tipinde bir kedi oluşturuldu!");
    }

}
