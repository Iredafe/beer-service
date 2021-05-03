package dafe.springframework.beerservice.SalaryApp;

public class PartTimeEmployeePayrollPDF extends EmployeePayroll{
    public PartTimeEmployeePayrollPDF(){
        employeeName="VOke";
        employeeType = "Part time";
    }

    @Override
    public void performCalculation() {
        System.out.println("Performing calculation for part time salary of " + employeeName);
    }

    @Override
    public void performPrint() {
        System.out.println("Printing the PDF format of part time employee payroll for " + employeeName);
    }

    @Override
    public void display() {
        System.out.println("Displaying part time employee payroll in PDF for " + employeeName);
    }

}
