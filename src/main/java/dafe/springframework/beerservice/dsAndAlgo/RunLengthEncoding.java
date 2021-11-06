package dafe.springframework.beerservice.dsAndAlgo;

public class RunLengthEncoding {

    public static String runLengthEncoding(String string){
    char [] storage = new char[string.length()];
    String store = "";
    int stringLength = 1;
    for(int i=0; i<string.length()-1; i++){
        if(string.charAt(i) == string.charAt(i+1) && stringLength < 9){
            stringLength++;
        }else{
            store += stringLength + "" + string.charAt(i);
            stringLength=1;
        }
    }
        return store;
    }


    public static void main(String[] args) {
        String input = runLengthEncoding("AAAAAAAAAAAAABBCCCCDD");
        System.out.println("This is the run length encoding of the string : " + input);
    }
}
