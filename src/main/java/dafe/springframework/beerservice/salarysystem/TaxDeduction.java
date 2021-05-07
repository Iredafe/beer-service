package dafe.springframework.beerservice.salarysystem;

public class TaxDeduction implements CalculateSalaryStrategy {
    @Override
    public void calculateSalary() {
        System.out.println("I am calculating salary with tax deductions included.");
    }
}
