package q6.payroll;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String createdDate, String updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position,
                   double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, String issueDate) {
        super(id, createdDate, updatedDate,
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position,
                baseSalary, rssbRegistered,
                month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction,
                overtimeHours, overtimeRate, bonus);
        if (payslipNumber == null || payslipNumber.isEmpty()) {
            throw new IllegalArgumentException("Payslip number cannot be empty");
        }
        if (issueDate == null || issueDate.isEmpty()) {
            throw new IllegalArgumentException("Issue date cannot be empty");
        }
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String getPayslipNumber() {
        return payslipNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String generatePayslip() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== PAYSLIP =====\n");
        sb.append("Payslip No: ").append(payslipNumber).append("  Issue Date: ").append(issueDate).append("\n");
        sb.append("Employee: ").append(getFullName()).append(" (ID: ").append(getEmployeeID()).append(")\n");
        sb.append("Position: ").append(getPosition()).append("\n");
        sb.append("Basic Pay: ").append(getBasicPay()).append("\n");
        sb.append("Transport Allowance: ").append(getTransportAllowance()).append("\n");
        sb.append("Housing Allowance: ").append(getHousingAllowance()).append("\n");
        sb.append("Overtime Hours: ").append(getOvertimeHours()).append(" Rate: ").append(getOvertimeRate()).append(" Amount: ").append(getOvertimePay()).append("\n");
        sb.append("Bonus: ").append(getBonus()).append("\n");
        sb.append("RSSB (5% of basic): ").append(getRssbContribution()).append("\n");
        sb.append("PAYE Tax: ").append(getPayeTax()).append("\n");
        sb.append("Loan Deduction: ").append(getLoanDeduction()).append("\n");
        sb.append("Gross Salary: ").append(getGrossSalary()).append("\n");
        sb.append("Total Deductions: ").append(getTotalDeductions()).append("\n");
        sb.append("Net Salary: ").append(getNetSalary()).append("\n");
        return sb.toString();
    }
}
