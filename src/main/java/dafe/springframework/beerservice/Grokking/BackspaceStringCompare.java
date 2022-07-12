package dafe.springframework.beerservice.Grokking;

public class BackspaceStringCompare {

    public static void main(String[] args) {

        System.out.println(compare("xy#z", "xzz#"));
        System.out.println(compare("xy#z", "xyz#"));
        System.out.println(compare("xp#", "xyz##"));
        System.out.println(compare("xywrrmp", "xywrrmu#p"));
    }
}
