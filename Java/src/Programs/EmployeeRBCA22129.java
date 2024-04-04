package Programs;

public class EmployeeRBCA22129 {
    private String name;
    private String jobTitle;
    private double basicSalary;
    private double da;
    private final double hra = 5000; // HRA is constant
    private double totalSalary;

    public EmployeeRBCA22129(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
        this.da = 0.1 * basicSalary; // DA is 10% of basic salary
        calculateTotalSalary();
    }

    public void calculateTotalSalary() {
        totalSalary = basicSalary + da + hra;
    }

    public void updateBasicSalary(double newBasicSalary) {
        this.basicSalary = newBasicSalary;
        this.da = 0.1 * newBasicSalary; // Update DA based on new basic salary
        calculateTotalSalary();
    }

    public double getDa() {
        return da;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public static void main(String[] args) {
        // Create an instance of EmployeeRBCA22129
        EmployeeRBCA22129 employee = new EmployeeRBCA22129("John Doe", "Software Engineer", 50000);

        // Print out initial DA and total salary
        System.out.println("Initial DA: " + employee.getDa());
        System.out.println("Initial Total Salary: " + employee.getTotalSalary());

        // Update basic salary
        employee.updateBasicSalary(60000);

        // Print out updated DA and total salary
        System.out.println("Updated DA: " + employee.getDa());
        System.out.println("Updated Total Salary: " + employee.getTotalSalary());
    }
}