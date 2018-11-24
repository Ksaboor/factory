package DogFactory;

public class DogFactory {

    public static Dog getDog(String criteria){

        if (criteria == "small") {
            return new Poodle();
        }
        else if (criteria == "big") {
            return new Rottweiler();
        } else if (criteria == "special") {
            return new SiberianHusky();
        }
            return null;
    }
}
