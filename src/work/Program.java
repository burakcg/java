package work;

enum Directions{
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private String sCode;

    private Directions(String sCode){
        this.sCode = sCode;
    }

    public String getsCode(){
        return this.sCode;
    }
}

public class Program {

    public static void main(String[] args) {
        Dog lezzy = new Dog();

        Dog karabas = new Dog("Sokak Köpeği", 5, "Beyaz", "Hev Hev", 34);
        Dog dogo = new Dog("Arjantin Dogo", 3, "Beyaz", "Hov Hov", 56);

        int deneme[] = new int[20];
        int denemex[][] = new int[20][20];

        try {

            karabas.setWeight(101);

        } catch (Exception error) {

            System.out.println(error.getMessage());

        }

        System.out.println(karabas.getWeight());
        karabas.bark();
        System.out.println(karabas.breed);

        dogo.bark();
        System.out.println(dogo.breed);

        System.out.println(Dog.count);

        System.out.println(Dog.humanAge(karabas.age));
        System.out.println(Dog.humanAge(2));

        ////////////////////////////////////////////////

        Cat haydar = new Cat(Cat.Breed.TEKIR, 3, "siyah");

        System.out.println(haydar.breed);
        System.out.println(Directions.WEST.getsCode());

    }

}