package dafe.springframework.beerservice.SalaryApp;

public class ContractEmployeeFactory extends EmployeePayrollFactory{

    @Override
    public EmployeePayroll createEmployeePayroll(String type) {

        if(type.equalsIgnoreCase("PDF")){
            return new ContractEmployeePayrollPDF();
        }else if(type.equalsIgnoreCase("JSON")){
            return new ContractEmployeePayrollJSON();
        }

        return null;
    }
}
