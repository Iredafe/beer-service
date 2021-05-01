package dafe.springframework.beerservice;

public class NoTaxDeduction implements CalculateSalaryStrategy{
    @Override
    public void calculateSalary() {
        System.out.println("I am calculating with no tax deductions");
    }
}
