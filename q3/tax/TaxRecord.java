package q3.tax;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    private double credits;

    public TaxRecord(int id, String createdDate, String updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     String assessmentDate, double assessedTax,
                     String paymentDate, double paymentAmount,
                     String receiptNo, double credits) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact,
                employeeName, salary, employeeTIN,
                declarationMonth, totalIncome,
                assessmentDate, assessedTax,
                paymentDate, paymentAmount);
        if (receiptNo == null || receiptNo.isEmpty()) {
            throw new TaxDataException("Receipt number cannot be empty");
        }
        if (credits < 0) {
            throw new TaxDataException("Credits cannot be negative");
        }
        this.receiptNo = receiptNo;
        this.credits = credits;
        this.totalTax = 0.0; // will be set by computeTax
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getCredits() {
        return credits;
    }

    public double computeTax() {
        // totalTax = (salary × rate) – credits
        this.totalTax = (getSalary() * getRate()) - credits;
        if (totalTax < 0) {
            totalTax = 0;
        }
        return totalTax;
    }
}
