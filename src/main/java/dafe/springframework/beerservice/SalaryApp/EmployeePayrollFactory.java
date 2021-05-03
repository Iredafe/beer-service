package dafe.springframework.beerservice.SalaryApp;

public abstract class EmployeePayrollFactory {

    public EmployeePayroll selectPayroll(String type){

        EmployeePayroll employeePayroll;
        employeePayroll = createEmployeePayroll(type);

        employeePayroll.performCalculation();
        employeePayroll.performPrint();
        employeePayroll.display();

        return employeePayroll;
    }


    public abstract EmployeePayroll createEmployeePayroll(String type);

}
