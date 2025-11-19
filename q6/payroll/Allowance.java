package q6.payroll;

public class Allowance extends Deduction {
    private double overtimeHours; // >= 0
    private double overtimeRate;  // >= 0
    private double bonus;         // >= 0

    public Allowance(int id, String createdDate, String updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position,
                     double baseSalary, boolean rssbRegistered,
                     int month, int year, String startDate, String endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double payeTax, double loanDeduction,
                     double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate,
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position,
                baseSalary, rssbRegistered,
                month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction);
        if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0) {
            throw new IllegalArgumentException("Allowance values cannot be negative");
        }
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public double getBonus() {
        return bonus;
    }

    public double getOvertimePay() {
        return overtimeHours * overtimeRate;
    }
}
