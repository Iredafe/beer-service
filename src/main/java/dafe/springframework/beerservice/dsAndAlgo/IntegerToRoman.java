package dafe.springframework.beerservice.dsAndAlgo;

import java.util.TreeMap;

public class IntegerToRoman {

    private static Numeral[] numerals ={
            new Numeral("M", 1000),
            new Numeral("DM",900),
            new Numeral("D", 500),
            new Numeral("CD",400),
            new Numeral("C", 100),
            new Numeral("XC", 90),
            new Numeral("L",50),
            new Numeral("XL", 40),
            new Numeral("X",10),
            new Numeral("IX", 9),
            new Numeral("V", 5),
            new Numeral("IV", 4),
            new Numeral("I", 1)


    };

    public static String intToRoman(int input){
        String result="";
        for(Numeral numeral: numerals){
            int numberOfSymbols = input/numeral.value;
            System.out.println("number of symbols is " +numberOfSymbols);
            if(numberOfSymbols!=0){
                result+= numeral.symbol.repeat(numberOfSymbols);
                input%=numeral.value;
            }
        }

        return result;
    }

   static class Numeral{
        public String symbol;
        public int value;
        public Numeral(String symbol, int value){
            this.symbol=symbol;
            this.value=value;
        }
    }

    public final static String intToRomanWithHashmap(int input){
       int length = myMap.floorKey(input);
       if(input==length){
           return myMap.get(input);
       }
        return myMap.get(length) + intToRomanWithHashmap(input-length);
    }

    public final static TreeMap<Integer, String> myMap= new TreeMap<Integer, String>(){
        {
            myMap.put(1000,"M");
            myMap.put(900,"DM");
            myMap.put(500,"D");
            myMap.put(400,"CD");
            myMap.put(100,"C");
            myMap.put(90,"XC");
            myMap.put(50,"L");
            myMap.put(40,"XL");
            myMap.put(10,"X");
            myMap.put(9,"IX");
            myMap.put(5,"V");
            myMap.put(4,"IV");
            myMap.put(1,"I");
        }
    };

    public static void main(String[] args) {

        int input = 4;
        System.out.println("The roman numeral of " + input +" is: " + intToRoman(input));
        System.out.println("The roman numeral of " + input +" is: " +intToRomanWithHashmap(input));
    }
}
