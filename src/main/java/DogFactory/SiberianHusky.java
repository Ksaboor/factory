package DogFactory;

public class SiberianHusky implements Dog {
    public void speak() {
        System.out.println("The husky says \"What's up dude\"");
    }

    public int getAge() {
        return 4;
    }
}
