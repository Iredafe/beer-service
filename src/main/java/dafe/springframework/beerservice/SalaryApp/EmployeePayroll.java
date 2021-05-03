package dafe.springframework.beerservice.SalaryApp;

import dafe.springframework.beerservice.CalculateSalaryStrategy;
import dafe.springframework.beerservice.salarysystem.PrintReportStrategy;

import java.util.Date;

public abstract class EmployeePayroll {

    protected CalculateSalaryStrategy calculateSalaryStrategy;
    protected String employeeName;
    protected String employeeAddress;
    protected String employeeType;
    protected String title;
    protected String department;
    protected Date paymentDate;
    protected String paymentCycle;

    public void performCalculation() {
        calculateSalaryStrategy.calculateSalary();
    }

    public void performPrint() {

    }

    public abstract void display();



}
