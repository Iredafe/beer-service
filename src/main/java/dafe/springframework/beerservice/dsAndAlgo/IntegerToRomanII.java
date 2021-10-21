package dafe.springframework.beerservice.dsAndAlgo;

public class IntegerToRomanII {

    public static String intToRoman(int input){

        int[] intCode={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M","CM","D", "CD", "C","XC","L","XL","X","IX","V","IV","I" };

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<intCode.length; i++){
            while (input>=intCode[i]){
                sb.append(code[i]);
                input-=intCode[i];
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int input = 4;
        System.out.println("The roman numeral of " + input +" is: " + intToRoman(input));
    }

}
