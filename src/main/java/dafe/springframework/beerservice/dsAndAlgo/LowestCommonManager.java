package dafe.springframework.beerservice.dsAndAlgo;

import org.aspectj.weaver.ast.Or;

import java.util.ArrayList;
import java.util.Arrays;
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

    static class OrgInfo{
        int numImportantReports;
        List<OrgChart> lowestCommonManager;

        OrgInfo(int numImportantReports, List<OrgChart> lowestCommonManager){
            this.numImportantReports = numImportantReports;
            this.lowestCommonManager = lowestCommonManager;
        }
    }

    public static OrgInfo getOrgInfo(OrgChart topManager, OrgChart reportOne, OrgChart reportTwo){

        return null;
    }

    public static void main(String[] args) {

    }
}
