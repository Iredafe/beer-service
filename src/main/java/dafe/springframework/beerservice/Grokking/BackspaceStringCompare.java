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
            if(firstString.charAt(validCharIndex1) != secondString.charAt(validCharIndex2)) return false;

            index1=validCharIndex1-1;
            index2=validCharIndex2-1;
        }
        return true;
    }

    private static int getValidCharIndex(int index, String string){
        int backspaceCount = 0;
        while(index >=0){
            if(string.charAt(index)=='#'){
                backspaceCount++;
            }else if(backspaceCount>0){
                backspaceCount--;
            }else break;

            index--;
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println(compare("xy#z", "xzz#"));
        System.out.println(compare("xy#z", "xyz#"));
        System.out.println(compare("xp#", "xyz##"));
        System.out.println(compare("xywrrmp", "xywrrmu#p"));
    }
}
