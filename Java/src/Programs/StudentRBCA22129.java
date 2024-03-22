 package Programs;

public class StudentRBCA22129 {
	    private String name;
	    private int age;
	    private String address;

	    // Constructor with default values
	    public StudentRBCA22129 () {
	        this.name = "Unknown";
	        this.age = 0;
	        this.address = "Not Available";
	    }

	    // Method to set name and age
	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to set name, age, and address
	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to print student information
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println();
}
}
