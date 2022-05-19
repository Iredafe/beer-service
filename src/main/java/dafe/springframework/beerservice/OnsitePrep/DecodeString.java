package dafe.springframework.beerservice.OnsitePrep;

public class DecodeString {

    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println("This is the decoded string : " + decodeString(s));
    }
}
