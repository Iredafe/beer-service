package dafe.springframework.beerservice.Grokking;

public class ConcatenatedWords {

    public static void main(String[] args) {
        List<Integer> result = findWordConcatenation(
                "catfoxcat", new String[] { "cat", "fox" });
        System.out.println(result);
        result = findWordConcatenation(
                "catcatfoxfox", new String[] { "cat", "fox" });
        System.out.println(result);
    }
}
