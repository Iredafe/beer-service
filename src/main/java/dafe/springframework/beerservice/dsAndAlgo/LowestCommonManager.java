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
        OrgChart lowestCommonManager;

        OrgInfo(int numImportantReports, OrgChart lowestCommonManager){
            this.numImportantReports = numImportantReports;
            this.lowestCommonManager = lowestCommonManager;
        }
    }

    public static OrgInfo getOrgInfo(OrgChart manager, OrgChart reportOne, OrgChart reportTwo){

        int numImportantReports = 0;

        for(OrgChart directReport : manager.directReports) {
            //get manager
            OrgInfo orgInfo = getOrgInfo(directReport, reportOne, reportTwo);

            if (orgInfo.lowestCommonManager != null) {
                return orgInfo;
            }

            numImportantReports += orgInfo.numImportantReports;
        }

        if(manager == reportOne || manager == reportTwo){
            numImportantReports++;
        }

        OrgChart lowestCommonManager = numImportantReports == 2 ? manager : null;

        OrgInfo newOrgInfo = new OrgInfo(numImportantReports, lowestCommonManager);
        return newOrgInfo;
    }

    public static OrgChart getLowestCommonManager(OrgChart topManager, OrgChart reportOne, OrgChart reportTwo){

        return getOrgInfo(topManager, reportOne, reportTwo).lowestCommonManager;
    }

    public static void main(String[] args) {

            OrgChart orgI = new OrgChart('I', new ArrayList());
            OrgChart orgH = new OrgChart('H', new ArrayList());
            OrgChart orgG = new OrgChart('G', new ArrayList());
            OrgChart orgF = new OrgChart('F', new ArrayList());
            OrgChart orgE = new OrgChart('E', new ArrayList());
            OrgChart orgD = new OrgChart('D', Arrays.asList(orgH,orgI));
            OrgChart orgC = new OrgChart('C', Arrays.asList(orgF,orgG));
            OrgChart orgB = new OrgChart('B', Arrays.asList(orgD,orgE));
            OrgChart orgA = new OrgChart('A', Arrays.asList(orgB,orgC));


    }
}
