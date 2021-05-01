package dafe.springframework.beerservice;

public class JSONStrategy implements PrintReportStrategy{
    @Override
    public void print() {
        System.out.println("I am printing in JSON format");
    }
}
