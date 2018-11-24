package DogFactory;

public class Rottweiler implements Dog {
    public void speak() {
        System.out.println("The DogFactory.Rottweiler says (in a deep voice) \"WOOF\"");
    }

    public int getAge() {
        return 8;
    }
}
