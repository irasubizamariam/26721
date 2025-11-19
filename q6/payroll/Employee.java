package q6.payroll;

public class Employee extends Department {
    private int employeeID;      // >= 1000
    private String fullName;
    private String position;
    private double baseSalary;   // > 0
    private boolean rssbRegistered;

    public Employee(int id, String createdDate, String updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position,
                    double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName);
        if (employeeID < 1000) {
            throw new IllegalArgumentException("EmployeeID must be >= 1000");
        }
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Full name cannot be empty");
        }
        if (position == null || position.isEmpty()) {
            throw new IllegalArgumentException("Position cannot be empty");
        }
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public boolean isRssbRegistered() {
        return rssbRegistered;
    }
}
