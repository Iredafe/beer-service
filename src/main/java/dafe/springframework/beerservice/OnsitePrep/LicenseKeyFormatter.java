package dafe.springframework.beerservice.OnsitePrep;

import java.util.Locale;

public class LicenseKeyFormatter {
    private static String licenseKeyFormatter(String string, int k) {
        StringBuilder mutableString = new StringBuilder();
        int temp = k;
        string = string.toUpperCase();
        for(int i=0; i<string.length(); i++){
            char character = string.charAt(i);
            if(k>0 && string.charAt(i) != '-'){
                k=temp;
                mutableString.append(character);
            }
            if(k==0 && i!=0){
                mutableString.append('-');
                k=temp;
            }

            while(mutableString.charAt(0) == '-') mutableString.substring(1);
        }
            String result = mutableString.reverse().toString();
        return result;
    }



    public static void main(String[] args) {
        String input1 = "5F3Z-2e-9-w"; int k1 = 4;
        String input2 = "2-5g-3-J"; int k2 = 2;

        System.out.println("Format license key : " + licenseKeyFormatter(input1, k1));
    }

}
