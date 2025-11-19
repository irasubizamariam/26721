package q3.tax;

public class Employee extends Employer {
    private String employeeName;
    private double salary; // > 0
    private String employeeTIN; // valid TIN

    public Employee(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact);
        if (employeeName == null || employeeName.isEmpty()) {
            throw new TaxDataException("Employee name cannot be empty");
        }
        if (salary <= 0) {
            throw new TaxDataException("Salary must be greater than 0");
        }
        if (!isValidTin(employeeTIN)) {
            throw new TaxDataException("Employee TIN must be 9 digits");
        }
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeTIN() {
        return employeeTIN;
    }
}
