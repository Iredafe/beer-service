package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.List;

public class Find_DuplicateFile {

    public static List <List<String>> findDuplicate(String[] path){

        HashMap <String, List<String>> myHashStore = new HashMap<>();
        


    }

    public static void main(String[] args) {
        String [] input ={"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

        System.out.println("The answer is : " + findDuplicate(input));
    }

}
