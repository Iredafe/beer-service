package dafe.springframework.beerservice.SalaryApp;


public class FullTimeEmployeePayrollPDF extends EmployeePayroll {

    public FullTimeEmployeePayrollPDF(){
        employeeName="Mike";
        employeeType = "Full time";
    }

    @Override
    public void performCalculation() {
        System.out.println("Performing calculation for full time salary for " +employeeName);
    }

    @Override
    public void performPrint() {
        System.out.println("Printing the PDF format of full time employee payroll for " +employeeName);
    }

    @Override
    public void display() {
        System.out.println("Displaying full time employee payroll in PDF for " +employeeName);
    }


}
