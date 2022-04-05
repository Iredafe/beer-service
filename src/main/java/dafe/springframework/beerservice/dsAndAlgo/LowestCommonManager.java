package dafe.springframework.beerservice.dsAndAlgo;

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
        if(manager == null) return null;
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
        return null;
    }

    public static void main(String[] args) {

    }
}
