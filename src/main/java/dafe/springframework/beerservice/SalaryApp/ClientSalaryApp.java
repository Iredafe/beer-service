package dafe.springframework.beerservice.SalaryApp;

public class ClientSalaryApp {


    public static void main(String[] args) {


        EmployeePayrollFactory fullTimefactory = new FullTimeEmployeeFactory();

        EmployeePayrollFactory partTimeFactory=new PartTimePayrollFactory();

        EmployeePayrollFactory contractFactory=new ContractEmployeeFactory();

        EmployeePayroll payroll = fullTimefactory.selectPayroll("PDF");
        System.out.println("Creating fulltime payroll in PDF for " + payroll.employeeName);
        payroll = fullTimefactory.selectPayroll("JSON");
        System.out.println("Creating full time payroll in JSON for " + payroll.employeeName);

        payroll = partTimeFactory.selectPayroll("PDF");
        System.out.println("Creating Part time payroll in PDF for " + payroll.employeeName);
        payroll = fullTimefactory.selectPayroll("JSON");
        System.out.println("Creating part time payroll in JSON for " + payroll.employeeName);

        payroll = contractFactory.selectPayroll("PDF");
        System.out.println("Creating contract payroll in PDF for " + payroll.employeeName);
        payroll = contractFactory.selectPayroll("JSON");
        System.out.println("Creating contract payroll in JSON for " + payroll.employeeName);


    }

}
