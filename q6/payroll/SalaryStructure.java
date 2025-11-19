package q6.payroll;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;           // >= 0
    private double transportAllowance; // >= 0
    private double housingAllowance;   // >= 0

    public SalaryStructure(int id, String createdDate, String updatedDate,
                           String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position,
                           double baseSalary, boolean rssbRegistered,
                           int month, int year, String startDate, String endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate,
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position,
                baseSalary, rssbRegistered,
                month, year, startDate, endDate);
        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0) {
            throw new IllegalArgumentException("Salary structure values cannot be negative");
        }
        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public double getHousingAllowance() {
        return housingAllowance;
    }
}
