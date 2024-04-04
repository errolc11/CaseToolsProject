package Programs;

public class VehicleRBCA22129 {
    private int horsepower;

    public VehicleRBCA22129(int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive() {
        System.out.println("Vehicle is being driven");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public static void main(String[] args) {
        // Create an instance of VehicleRBCA22129
        VehicleRBCA22129 vehicle = new VehicleRBCA22129(200);

        // Print out vehicle's horsepower
        System.out.println("Vehicle's horsepower: " + vehicle.getHorsepower());

        // Drive the vehicle
        vehicle.drive();
    }
}
