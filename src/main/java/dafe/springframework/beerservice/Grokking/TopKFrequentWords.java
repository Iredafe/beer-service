package dafe.springframework.beerservice.Grokking;

public class TopKFrequentWords {

    public static void main(String[] args) {
        String [] words = {"i","love","leetcode","i","love","coding"}; int k=2;

        System.out.println("Top " + k + " frequent words are : " + getTopKFrequentWords(words, k));
    }
}
