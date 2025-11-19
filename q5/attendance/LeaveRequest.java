package q5.attendance;

public class LeaveRequest extends AttendanceRecord {
    private String requestDate;
    private String reason;
    private boolean approved; // true/false

    public LeaveRequest(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic,
                        String recordStudentID, String sessionID, String status,
                        String requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                recordStudentID, sessionID, status);
        if (requestDate == null || requestDate.isEmpty()) {
            throw new IllegalArgumentException("Request date cannot be empty");
        }
        if (reason == null || reason.isEmpty()) {
            throw new IllegalArgumentException("Reason cannot be empty");
        }
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public String getReason() {
        return reason;
    }

    public boolean isApproved() {
        return approved;
    }
}
