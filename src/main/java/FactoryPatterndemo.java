import DogFactory.DogFactory;
import DogFactory.Dog;
public class FactoryPatterndemo {

    public static void main(String[] args) {

        printDogFactory();
        printCarFactory();
    }

    private static void printCarFactory() {

    }

    private static void printDogFactory() {
        // Create a small dog
        Dog dog = DogFactory.getDog("small");
        dog.speak();
        System.out.println("Small dog age is: "+ dog.getAge());

        //Create a big dog
        dog = DogFactory.getDog("big");
        dog.speak();
        System.out.println("Big dog age is: "+ dog.getAge());

        //Create Special Dog
        dog = DogFactory.getDog("special");
        dog.speak();
        System.out.println("Special dog age is: "+ dog.getAge());

    }


}
