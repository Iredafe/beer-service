package dafe.springframework.beerservice;

public class FullTimeEmployeePayroll extends EmployeePayroll{

    public FullTimeEmployeePayroll(){
    calculateSalaryStrategy= new TaxDeduction();
    printJSONReportStrategy = new JSONStrategy();
    printPDFReportStrategy = new PDFStrategy();

    }

    public void display() {
        System.out.println("I am displaying the full time employee payroll");
    }
}
