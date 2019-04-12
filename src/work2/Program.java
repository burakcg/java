package work2;

import work3.Animal;

public class Program {

    public static void main(String[] args) {

        Dog karabas = new Dog("karabas",3,Pet.Color.WHITE, 45, Dog.Breed.KANGAL);
        Cat cingoz = new Cat("cingoz", 2, Pet.Color.BLUE, 23, Cat.Breed.TEKIR);

        Pet[] animals = new Pet[]{karabas, cingoz};

        karabas.bark();
        cingoz.meaw();

        System.out.println(karabas.getName());
        System.out.println(karabas.goodBoy());

        Pet mahmut = karabas;
        Pet ahmet = cingoz;

        mahmut.deneme();
        ahmet.deneme();
    }

}