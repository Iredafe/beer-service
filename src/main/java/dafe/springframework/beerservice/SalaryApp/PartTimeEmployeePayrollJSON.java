package dafe.springframework.beerservice.SalaryApp;

public class PartTimeEmployeePayrollJSON extends EmployeePayroll{
    public PartTimeEmployeePayrollJSON(){
        employeeName="Sam";
        employeeType = "Part time";
    }

    @Override
    public void performCalculation() {
        System.out.println("Performing calculation for part time salary " +employeeName);
    }

    @Override
    public void performPrint() {
        System.out.println("Printing the JSON format of part time employee payroll " + employeeName);
    }

    @Override
    public void display() {
        System.out.println("Displaying part time employee payroll in JSON " +employeeName);
    }
}
