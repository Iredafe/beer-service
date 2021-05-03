package dafe.springframework.beerservice.SalaryApp;

public class ContractEmployeePayrollPDF extends EmployeePayroll{

    public ContractEmployeePayrollPDF(){
        employeeName="Osas";
        employeeType = "Contract";
    }

    @Override
    public void performCalculation() {
        System.out.println("Performing calculation for contract salary");
    }

    @Override
    public void performPrint() {
        System.out.println("Printing the PDF format of contract employee payroll");
    }

    @Override
    public void display() {
        System.out.println("Displaying contract employee payroll in PDF");
    }
}
