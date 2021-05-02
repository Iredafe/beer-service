package dafe.springframework.beerservice.salarysystem;

import dafe.springframework.beerservice.salarysystem.PrintReportStrategy;

public class JSONStrategy implements PrintReportStrategy {

    public void print(){
        System.out.println("I am printing the JSON format");
    }
}
