package dafe.springframework.beerservice.dsAndAlgo;

public class RunLengthEncoding {

    public static String runLengthEncoding(String string){
    StringBuilder store = new StringBuilder();
    int stringLength = 1;
    for(int i=0; i<string.length()-1; i++){
        if(string.charAt(i) == string.charAt(i+1) && stringLength != 9){
            stringLength+=1;
        }else{
            store.append(stringLength + "" + string.charAt(i));
            stringLength=1;
        }
    }
        return store.toString();
    }


    public static void main(String[] args) {
        String input = runLengthEncoding("AAAAAAAAAAAAABBCCCCDD");
        System.out.println("This is the run length encoding of the string : " + input);
    }
}
