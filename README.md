OOP Assignment – Java Systems (Q1–Q6)

This project contains six small Java systems built to practice Object-Oriented Programming (OOP) concepts such as inheritance, encapsulation, constructors with validation, and user input with Scanner.

Each question (Q1–Q6) is implemented in its own package with a 10-class inheritance chain and a separate main method.

Project Structure

•  src/q1/stock – Stock Management System  
  Classes from Entity up to StockReport.  
•  Final class: StockReport with generateReport()  
•  Entry point: q1.stock.Q1Main
•  src/q2/flight – Flight Booking System  
  Classes from Entity up to Ticket.  
•  Final class: Ticket with calculateFare() = base fare + taxes − discounts  
•  Entry point: q2.flight.Q2Main
•  src/q3/tax – Tax Administration System  
  Classes from Entity up to TaxRecord.  
•  Custom exception: TaxDataException for invalid tax data  
•  Final class: TaxRecord with computeTax() = salary × rate − credits  
•  Entry point: q3.tax.Q3Main
•  src/q4/procurement – Procurement Management System  
  Classes from Entity up to ProcurementReport.  
•  Final class: ProcurementReport with calculateTotal() (sum of invoice amounts)  
•  Entry point: q4.procurement.Q4Main
•  src/q5/attendance – Attendance Management System  
  Classes from Entity up to AttendanceSummary.  
•  Final class: AttendanceSummary with generateSummary() (attendance percentage)  
•  Entry point: q5.attendance.Q5Main
•  src/q6/payroll – Payroll Management System (RSSB)  
  Classes from Entity up to Payslip.  
•  RSSB contribution = 5% of basic pay  
•  Payroll computes gross salary, total deductions, and net salary  
•  Final class: Payslip with generatePayslip() to display a formatted payslip  
•  Entry point: q6.payroll.Q6Main

How to Run

1. Open the project in your IDE (e.g. IntelliJ IDEA).
2. Choose the main class for the question you want to run:
◦  Q1: q1.stock.Q1Main
◦  Q2: q2.flight.Q2Main
◦  Q3: q3.tax.Q3Main
◦  Q4: q4.procurement.Q4Main
◦  Q5: q5.attendance.Q5Main
◦  Q6: q6.payroll.Q6Main
3. Run the class.  
   The program will ask for input using the console and then display a report or summary showing all entered data and the calculated results.

Key OOP Concepts Used

•  Inheritance: Each system uses a 10-level class hierarchy starting from Entity.
•  Encapsulation: All attributes are private with getters (and validations in constructors).
•  Validation: Constructors check that inputs meet the required rules (e.g. positive IDs, valid emails, digit counts).
•  Input Handling: Each system uses java.util.Scanner to collect data from the user.
