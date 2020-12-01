package se.lexicon.samuel;

public class CarBase {
    private String CarName;

    public String getCarName() {
        return CarName;
    }

    public CarBase(String carName) {
        CarName = carName;
        System.out.println("This is a " + carName);
    }

}
