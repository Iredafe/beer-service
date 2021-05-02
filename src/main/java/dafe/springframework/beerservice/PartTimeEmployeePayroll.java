package dafe.springframework.beerservice;

public class PartTimeEmployeePayroll extends EmployeePayroll{

    @Override
    public void display() {
        System.out.println("I am displaying the parttime employee payroll");
    }
}
