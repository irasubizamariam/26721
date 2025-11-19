package q3.tax;

public class TaxAssessment extends TaxDeclaration {
    private String assessmentDate;
    private double assessedTax; // >= 0

    public TaxAssessment(int id, String createdDate, String updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         String assessmentDate, double assessedTax) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact,
                employeeName, salary, employeeTIN,
                declarationMonth, totalIncome);
        if (assessmentDate == null || assessmentDate.isEmpty()) {
            throw new TaxDataException("Assessment date cannot be empty");
        }
        if (assessedTax < 0) {
            throw new TaxDataException("Assessed tax cannot be negative");
        }
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public String getAssessmentDate() {
        return assessmentDate;
    }

    public double getAssessedTax() {
        return assessedTax;
    }
}
