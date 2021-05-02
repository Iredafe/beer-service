package dafe.springframework.beerservice.salarysystem;

public class PayrollSystem
{

    public static void main(String[] args) {
        EmployeePayroll payroll = new FullTimeEmployeePayroll();
        System.out.println("Full time staff payroll");
        payroll.performCalculation();
        payroll.performPrint();

        EmployeePayroll partTimePayroll = new PartTimeEmployeePayroll();
        System.out.println("Part time staff payroll ");
        partTimePayroll.performCalculation();
        partTimePayroll.performPrint();

        EmployeePayroll contractPayroll = new ContractEmployeePayroll();
        System.out.println("Contract staff payroll");
        contractPayroll.performCalculation();
        contractPayroll.performPrint();

         }
}
