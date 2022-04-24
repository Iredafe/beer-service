package dafe.springframework.beerservice.OnsitePrep;

public class BackSpaceCompare {

    private static boolean backSpaceCompare(String s, String t){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char character = s.charAt(i);
            if(character != '#'){
                sb1.append(character);
            }
        }

        for(int i=0; i<t.length(); i++){
            char character = t.charAt(i);
            if(character != '#') {
                sb2.append(character);
            }
        }

    }

    public static void main(String[] args) {
        String first = "ab#c";
        String second = "ad#c";

        System.out.println("Both strings are same ? " + backSpaceCompare(first, second));
    }
}
