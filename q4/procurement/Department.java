package q4.procurement;

public class Department extends Organization {
    private String deptName;
    private String deptCode; // alphanumeric; >= 3 chars
    private String managerName;

    public Department(int id, String createdDate, String updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        if (deptName == null || deptName.isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }
        if (deptCode == null || !deptCode.matches("[A-Za-z0-9]{3,}")) {
            throw new IllegalArgumentException("Department code must be alphanumeric and at least 3 characters");
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
