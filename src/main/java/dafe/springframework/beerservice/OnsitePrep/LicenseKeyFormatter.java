package dafe.springframework.beerservice.OnsitePrep;

public class LicenseKeyFormatter {


    public static void main(String[] args) {
        String input1 = "5F3Z-2e-9-w"; int k1 = 4;
        String input2 = "2-5g-3-J"; int k2 = 2;

        System.out.println("Format license key : " + licenseKeyFormatter(input1, k1));
    }
}
