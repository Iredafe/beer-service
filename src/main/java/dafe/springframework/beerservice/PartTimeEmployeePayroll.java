package dafe.springframework.beerservice;

public class PartTimeEmployeePayroll extends EmployeePayroll{

    public PartTimeEmployeePayroll(){
        calculateSalaryStrategy = new TaxDeduction();
        printJSONReportStrategy = new JSONStrategy();
        printPDFReportStrategy = new PDFStrategy();
    }
    @Override
    public void display() {
        System.out.println("I am displaying the parttime employee payroll");
    }
}
