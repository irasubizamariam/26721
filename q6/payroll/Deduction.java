package q6.payroll;

public class Deduction extends SalaryStructure {
    private double rssbContribution; // 5% of basicPay
    private double payeTax;          // >= 0
    private double loanDeduction;    // >= 0

    public Deduction(int id, String createdDate, String updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position,
                     double baseSalary, boolean rssbRegistered,
                     int month, int year, String startDate, String endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate,
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position,
                baseSalary, rssbRegistered,
                month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance);
        if (payeTax < 0 || loanDeduction < 0) {
            throw new IllegalArgumentException("Deductions cannot be negative");
        }
        this.rssbContribution = basicPay * 0.05;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }

    public double getRssbContribution() {
        return rssbContribution;
    }

    public double getPayeTax() {
        return payeTax;
    }

    public double getLoanDeduction() {
        return loanDeduction;
    }
}
