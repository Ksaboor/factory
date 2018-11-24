package DogFactory;

public class Poodle implements Dog {
    public void speak() {
        System.out.println("The poodle says \"arf\"");
    }

    public int getAge() {
        return 3;
    }
}
