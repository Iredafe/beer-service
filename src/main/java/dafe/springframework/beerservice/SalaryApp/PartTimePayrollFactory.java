package dafe.springframework.beerservice.SalaryApp;

public class PartTimePayrollFactory extends EmployeePayrollFactory{

    @Override
    public EmployeePayroll createEmployeePayroll(String type) {

        if(type.equalsIgnoreCase("PDF")){
            return new PartTimeEmployeePayrollPDF();
        }else if(type.equalsIgnoreCase("JSON")){
            return new PartTimeEmployeePayrollJSON();
        }


        return null;
    }
}
