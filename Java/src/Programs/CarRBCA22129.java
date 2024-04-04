package Programs;

public class CarRBCA22129 extends VehicleRBCA22129 {
    private String make;

    public CarRBCA22129(int horsepower, String make) {
        super(horsepower);
        this.make = make;
    }

    public void drive() {
        super.drive();
        System.out.println("Car is being driven");
    }

    public String getMake() {
        return make;
    }

    public static void main(String[] args) {
        // Create an instance of CarRBCA22129
        CarRBCA22129 car = new CarRBCA22129(200, "Toyota");

        // Call methods on the car instance
        car.drive();
        System.out.println("Car make: " + car.getMake());
    }
}