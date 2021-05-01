package dafe.springframework.beerservice;

import java.util.Date;

public abstract class EmployeePayroll {
    private PrintReportStrategy printReportStrategy;
    private CalculateSalaryStrategy calculateSalaryStrategy;

    private String employeeName;
    private String employeeAddress;
    private String title;
    private String department;
    private Date paymentDate;
    private String paymentCycle;

}
