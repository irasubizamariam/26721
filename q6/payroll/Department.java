package q6.payroll;

public class Department extends Organization {
    private String deptName;
    private String deptCode;   // >= 3 chars
    private String managerName;

    public Department(int id, String createdDate, String updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptName == null || deptName.isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }
        if (deptCode == null || deptCode.length() < 3) {
            throw new IllegalArgumentException("Department code must be at least 3 characters");
        }
        if (managerName == null || managerName.isEmpty()) {
            throw new IllegalArgumentException("Manager name cannot be empty");
        }
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getManagerName() {
        return managerName;
    }
}
