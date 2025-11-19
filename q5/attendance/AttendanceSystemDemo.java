package q5.attendance;

import java.util.Scanner;

public class AttendanceSystemDemo {

    public void run(Scanner scanner) {
        System.out.println("--- ATTENDANCE MANAGEMENT SYSTEM (Q5) ---");

        System.out.print("Enter Entity ID (>0): ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter created date: ");
        String createdDate = scanner.nextLine();
        System.out.print("Enter updated date: ");
        String updatedDate = scanner.nextLine();

        System.out.print("Enter institution name: ");
        String institutionName = scanner.nextLine();
        System.out.print("Enter institution code (>=3 chars): ");
        String code = scanner.nextLine();
        System.out.print("Enter institution address: ");
        String address = scanner.nextLine();

        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();
        System.out.print("Enter department head: ");
        String departmentHead = scanner.nextLine();

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter course credits (>0): ");
        int credits = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter instructor name: ");
        String instructorName = scanner.nextLine();
        System.out.print("Enter instructor email: ");
        String email = scanner.nextLine();
        System.out.print("Enter instructor phone (10 digits): ");
        String phone = scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter student age (>0): ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter class session date: ");
        String sessionDate = scanner.nextLine();
        System.out.print("Enter class topic: ");
        String topic = scanner.nextLine();

        System.out.print("Enter attendance record student ID: ");
        String recordStudentID = scanner.nextLine();
        System.out.print("Enter session ID: ");
        String sessionID = scanner.nextLine();
        System.out.print("Enter attendance status (Present/Absent): ");
        String status = scanner.nextLine();

        System.out.print("Enter leave request date: ");
        String requestDate = scanner.nextLine();
        System.out.print("Enter leave reason: ");
        String reason = scanner.nextLine();
        System.out.print("Is leave approved? (true/false): ");
        boolean approved = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter report date: ");
        String reportDate = scanner.nextLine();
        System.out.print("Enter total present: ");
        int totalPresent = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter total absent: ");
        int totalAbsent = Integer.parseInt(scanner.nextLine());

        try {
            AttendanceSummary summary = new AttendanceSummary(
                    id, createdDate, updatedDate,
                    institutionName, code, address,
                    departmentName, departmentHead,
                    courseName, courseCode, credits,
                    instructorName, email, phone,
                    studentName, studentID, age,
                    sessionDate, topic,
                    recordStudentID, sessionID, status,
                    requestDate, reason, approved,
                    reportDate, totalPresent, totalAbsent
            );

            double attendancePercentage = summary.generateSummary();

            System.out.println();
            System.out.println("=== ATTENDANCE SUMMARY ===");
            System.out.println("Report Date: " + summary.getReportDate());
            System.out.println("Student: " + studentName + " (" + studentID + ") Age: " + age);
            System.out.println("Course: " + courseName + " [" + courseCode + "] Credits: " + credits);
            System.out.println("Instructor: " + instructorName + " Email: " + email);
            System.out.println("Total Present: " + summary.getTotalPresent());
            System.out.println("Total Absent: " + summary.getTotalAbsent());
            System.out.println("Attendance % (Present/TotalSessions*100): " + attendancePercentage);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
