package q5.attendance;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits; // > 0

    public Course(int id, String createdDate, String updatedDate,
                  String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead);
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }
        if (courseCode == null || courseCode.isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be empty");
        }
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be greater than 0");
        }
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }
}
