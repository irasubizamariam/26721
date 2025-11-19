package q5.attendance;

public class ClassSession extends Student {
    private String sessionDate;
    private String topic;

    public ClassSession(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age);
        if (sessionDate == null || sessionDate.isEmpty()) {
            throw new IllegalArgumentException("Session date cannot be empty");
        }
        if (topic == null || topic.isEmpty()) {
            throw new IllegalArgumentException("Topic cannot be empty");
        }
        this.sessionDate = sessionDate;
        this.topic = topic;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public String getTopic() {
        return topic;
    }
}
