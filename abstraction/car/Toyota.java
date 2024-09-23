package abstraction.car;

public class Toyota extends Car {

    public Toyota(String carModel, String carNumber) {
        super(carModel, carNumber);
    }

    @Override
    public void Drive() {
        System.out.printf("%s %s is Driving%n",carModel,carNumber);
    }
    
}
