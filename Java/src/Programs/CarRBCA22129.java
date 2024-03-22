package Programs;


	public class CarRBCA22129 extends VehicleRBCA22129 {
	    private String make;

	    public CarRBCA22129 (int horsepower, String make) {
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
	}
