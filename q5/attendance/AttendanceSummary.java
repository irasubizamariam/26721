package q5.attendance;

public final class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, String createdDate, String updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             String sessionDate, String topic,
                             String recordStudentID, String sessionID, String status,
                             String requestDate, String reason, boolean approved,
                             String reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                recordStudentID, sessionID, status,
                requestDate, reason, approved);
        if (reportDate == null || reportDate.isEmpty()) {
            throw new IllegalArgumentException("Report date cannot be empty");
        }
        if (totalPresent < 0 || totalAbsent < 0) {
            throw new IllegalArgumentException("Totals cannot be negative");
        }
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public String getReportDate() {
        return reportDate;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        if (totalSessions == 0) {
            return 0.0;
        }
        return (totalPresent * 100.0) / totalSessions;
    }
}
