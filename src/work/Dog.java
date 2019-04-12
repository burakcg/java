package work;

public class Dog {

    public static int count = 0;
    public static final double PI = 3.14;

    public String breed;
    public int age;
    public String color;
    public String barkstyle;

    private float weight;

    public Dog() {
        System.out.println("Boş bir köpek oluşturuldu!");
        count += 1;
    }

    public Dog(String breed, int age, String color, String barkstyle, float weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.barkstyle = barkstyle;
        this.weight = weight;

        count += 1;
        System.out.println(this.breed+" Tipinde bir köpek oluşturuldu!");
    }

    public static int humanAge(int age) {
        return age*10;
    }

    public void bark() {
        System.out.println(this.barkstyle);
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) throws Exception {
        if (weight < 0 || weight > 100) {
            throw new Exception("Hata Oldu amına koduklarım");
        }
        this.weight = weight;
    }

}
