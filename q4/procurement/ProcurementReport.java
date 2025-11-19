package q4.procurement;

public final class ProcurementReport extends Invoice {
    private String reportDate;
    private String summary;
    private double[] invoiceAmounts;

    public ProcurementReport(int id, String createdDate, String updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode, String managerName,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, String orderDate, double totalAmount,
                             String deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             String reportDate, String summary,
                             double[] invoiceAmounts) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, managerName,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks,
                invoiceNo, invoiceAmount);
        if (reportDate == null || reportDate.isEmpty()) {
            throw new IllegalArgumentException("Report date cannot be empty");
        }
        if (summary == null || summary.isEmpty()) {
            throw new IllegalArgumentException("Summary cannot be empty");
        }
        this.reportDate = reportDate;
        this.summary = summary;
        if (invoiceAmounts == null || invoiceAmounts.length == 0) {
            this.invoiceAmounts = new double[]{invoiceAmount};
        } else {
            this.invoiceAmounts = invoiceAmounts;
        }
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getSummary() {
        return summary;
    }

    public double calculateTotal() {
        double total = 0;
        for (double amt : invoiceAmounts) {
            total += amt;
        }
        return total;
    }
}
