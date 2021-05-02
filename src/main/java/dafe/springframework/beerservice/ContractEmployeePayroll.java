package dafe.springframework.beerservice;

public class ContractEmployeePayroll extends EmployeePayroll{

    public ContractEmployeePayroll(){
        calculateSalaryStrategy= new NoTaxDeduction();
        printJSONReportStrategy = new JSONStrategy();
        printPDFReportStrategy = new PDFStrategy();

    }
    @Override
    public void display() {
        System.out.println("I am displaying the contract employee payroll");
    }
}
