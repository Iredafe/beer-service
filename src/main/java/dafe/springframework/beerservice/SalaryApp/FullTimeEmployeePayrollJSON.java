package dafe.springframework.beerservice.SalaryApp;

public class FullTimeEmployeePayrollJSON extends EmployeePayroll {

    public FullTimeEmployeePayrollJSON(){
        employeeName="Chioma";
        employeeType = "Full time";
    }

    @Override
    public void performCalculation() {
        System.out.println("Performing calculation for full time salary");
    }

    @Override
    public void performPrint() {
        System.out.println("Printing the JSON format of full time employee payroll");
    }

    @Override
    public void display() {
        System.out.println("Displaying full time employee payroll in JSON");
    }
}
