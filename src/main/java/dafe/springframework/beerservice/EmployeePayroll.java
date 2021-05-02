package dafe.springframework.beerservice;

import java.util.Date;

public abstract class EmployeePayroll {

    protected PrintReportStrategy printPDFReportStrategy;
    protected PrintReportStrategy printJSONReportStrategy;
    protected CalculateSalaryStrategy calculateSalaryStrategy;
    private String employeeName;
    private String employeeAddress;
    private String title;
    private String department;
    private Date paymentDate;
    private String paymentCycle;

    public void performCalculation() {
        calculateSalaryStrategy.calculateSalary();
    }

    public void performPrint() {
        printJSONReportStrategy.print();
        printPDFReportStrategy.print();
    }

    public abstract void display();
}