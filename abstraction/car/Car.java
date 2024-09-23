
package abstraction.car;

public abstract class Car {

    protected String carModel;
    protected String carNumber;
    
    public Car(String carModel, String carNumber) {
        this.carModel = carModel;
        this.carNumber = carNumber;
    }

    public abstract void Drive();
}
