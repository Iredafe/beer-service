package dafe.springframework.beerservice.Grokking;

public class DutchFlag {

    private static int[] sort(int [] array){

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 1, 0 };
        sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
