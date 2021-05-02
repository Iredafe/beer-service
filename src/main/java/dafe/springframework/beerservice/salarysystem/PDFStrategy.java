package dafe.springframework.beerservice.salarysystem;

public class PDFStrategy implements PrintReportStrategy{

    @Override
    public void print() {
        System.out.println("I am printing the PDF format");
    }
}
