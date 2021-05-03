package dafe.springframework.beerservice.SalaryApp;

public class FullTimeEmployeeFactory extends EmployeePayrollFactory{

    public EmployeePayroll createEmployeePayroll(String type){
        if(type.equalsIgnoreCase("PDF")){
            return new FullTimeEmployeePayrollPDF();
        }else if(type.equalsIgnoreCase("JSON")){
            return new FullTimeEmployeePayrollJSON();
        }
        return null;
    }
}
