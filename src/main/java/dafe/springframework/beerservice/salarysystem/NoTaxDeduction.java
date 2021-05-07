package dafe.springframework.beerservice.salarysystem;


public class NoTaxDeduction implements CalculateSalaryStrategy {
    @Override
    public void calculateSalary() {
        System.out.println("I am calculating with no tax deductions");
    }
}
