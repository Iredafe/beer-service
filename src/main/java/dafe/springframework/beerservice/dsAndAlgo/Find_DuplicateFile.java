package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_DuplicateFile {

    public static List <List<String>> findDuplicate(String[] paths){

        HashMap <String, List<String>> myHashStore = new HashMap<>();
        for(String path: paths){
            String [] values = path.split(" ");
            for(int i=1; i< values.length; i++){
                String [] fileName = values[i].split("\\(");
                fileName[1]= fileName[1].replace(")","");
         List<String> list = myHashStore.getOrDefault(fileName[1], new ArrayList<String>());
         list.add(values[0]+ "/" + fileName[0]);
         myHashStore.put(fileName[1], list);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(String key: myHashStore.keySet()){
            if(myHashStore.get(key).size()>1)
                result.add(myHashStore.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        String [] input ={"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efg)"};

        System.out.println("The answer is : " + findDuplicate(input));
    }

}
