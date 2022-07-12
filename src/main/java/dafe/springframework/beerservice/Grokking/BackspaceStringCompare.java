package dafe.springframework.beerservice.Grokking;

public class BackspaceStringCompare {

    private static boolean compare(String firstString, String secondString){

        return false;
    }

    public static void main(String[] args) {

        System.out.println(compare("xy#z", "xzz#"));
        System.out.println(compare("xy#z", "xyz#"));
        System.out.println(compare("xp#", "xyz##"));
        System.out.println(compare("xywrrmp", "xywrrmu#p"));
    }
}
