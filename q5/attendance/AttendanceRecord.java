package q5.attendance;

public class AttendanceRecord extends ClassSession {
    private String recordStudentID;
    private String sessionID;
    private String status; // Present/Absent

    public AttendanceRecord(int id, String createdDate, String updatedDate,
                            String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            String sessionDate, String topic,
                            String recordStudentID, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic);
        if (recordStudentID == null || recordStudentID.isEmpty()) {
            throw new IllegalArgumentException("Record student ID cannot be empty");
        }
        if (sessionID == null || sessionID.isEmpty()) {
            throw new IllegalArgumentException("Session ID cannot be empty");
        }
        if (status == null || !(status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent"))) {
            throw new IllegalArgumentException("Status must be Present or Absent");
        }
        this.recordStudentID = recordStudentID;
        this.sessionID = sessionID;
        this.status = status;
    }

    public String getRecordStudentID() {
        return recordStudentID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public String getStatus() {
        return status;
    }
}
