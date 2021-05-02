package dafe.springframework.beerservice;

public class PayrollSystem
{

    public static void main(String[] args) {
        EmployeePayroll payroll = new FullTimeEmployeePayroll();
        payroll.performCalculation();
        payroll.performPrint();
         }
}
