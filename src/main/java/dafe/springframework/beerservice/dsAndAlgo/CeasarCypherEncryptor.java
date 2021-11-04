package dafe.springframework.beerservice.dsAndAlgo;

public class CeasarCypherEncryptor {
    public static String caesarCypherEncryptor(String str, int key){
        char[] newString = new char[str.length()];
        for(int i=0; i< newString.length; i++){

        }
        return "";
    }


    public static void main(String[] args) {
        String str="xyz";
        int key =2;
        System.out.println("This is the new string : " + caesarCypherEncryptor(str, key));
    }
}
