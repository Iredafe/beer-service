package dafe.springframework.beerservice.OnsitePrep;

import java.util.Locale;

public class LicenseKeyFormatter {
    private static String licenseKeyFormatter(String string, int k) {
        StringBuilder mutableString = new StringBuilder();
        int temp = k;
        string = string.toUpperCase();
        for(int i=string.length()-1; i>=0; i--){
            char character = string.charAt(i);
            if(k>0 && character != '-'){
                mutableString.append(character);
                k--;
            }
            if(k==0 && i!=0){
                mutableString.append('-');
                k=temp;
            }

        }
        String result = mutableString.reverse().toString();
        while(result.charAt(0) == '-') {
            result=result.substring(1);
        }
        return result;
    }



    public static void main(String[] args) {
        String input1 = "-5F3Z-2e-9-w"; int k1 = 4;
        String input2 = "2-5g-3-J"; int k2 = 2;

        System.out.println("Format license key : " + licenseKeyFormatter(input1, k1));
    }

}
