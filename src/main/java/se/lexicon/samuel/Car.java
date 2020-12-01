package se.lexicon.samuel;

public class Car extends CarBase implements CarColour {

    public Car(String carName) {
        super(carName);
    }

    @Override
    public void colour(String colour) {
        System.out.println("The colour of the car " + getCarName() + " is " + colour);
    }
}
