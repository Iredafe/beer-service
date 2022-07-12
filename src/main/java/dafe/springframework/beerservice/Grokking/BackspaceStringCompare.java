package dafe.springframework.beerservice.Grokking;

public class BackspaceStringCompare {
    private static boolean compare(String firstString, String secondString){
        int index1 = firstString.length()-1;
        int index2 = secondString.length()-1;

        while(index1 >=0 || index2 >= 0){
            int validCharIndex1 = getValidCharIndex(index1, firstString);
            int validCharIndex2 = getValidCharIndex(index2, secondString);

            if(validCharIndex1 < 0 && validCharIndex2 <0) return true;
            if(validCharIndex1 < 0 || validCharIndex2 <0) return false;
        }
        return false;
    }

    private static int getValidCharIndex(int index, String string){

        return index;
    }
    public static void main(String[] args) {
        System.out.println(compare("xy#z", "xzz#"));
        System.out.println(compare("xy#z", "xyz#"));
        System.out.println(compare("xp#", "xyz##"));
        System.out.println(compare("xywrrmp", "xywrrmu#p"));
    }
}
