package q5.attendance;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        if (departmentName == null || departmentName.isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }
        if (departmentHead == null || departmentHead.isEmpty()) {
            throw new IllegalArgumentException("Department head cannot be empty");
        }
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }
}
