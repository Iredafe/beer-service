package dafe.springframework.beerservice;

public class ContractEmployeePayroll extends EmployeePayroll{

    @Override
    public void display() {
        System.out.println("I am displaying the contract employee payroll");
    }
}
