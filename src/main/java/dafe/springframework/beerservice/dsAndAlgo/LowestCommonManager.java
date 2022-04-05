package dafe.springframework.beerservice.dsAndAlgo;

import org.aspectj.weaver.ast.Or;

import java.util.List;

public class LowestCommonManager {
    static class OrgChart {
        char name;
        List<OrgChart> directReports;

        OrgChart(char name, List<OrgChart> directReports){
            this.name = name;
            this.directReports = directReports;
        }
    }

    public static void main(String[] args) {

    }
}
