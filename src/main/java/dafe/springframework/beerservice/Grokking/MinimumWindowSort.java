package dafe.springframework.beerservice.Grokking;

public class MinimumWindowSort {

    private static int sort(int [] array){

        int left=0, right=array.length-1;

        while(left < array.length-1 && array[left] <= array[left+1])
            left++;

        if(left == array.length-1) return 0;

        while(right>0 && array[right] >= array[right-1])
            right--;

        int subarrayMin = Integer.MAX_VALUE, subarrayMax = Integer.MIN_VALUE;

        for(int k=left; k<=right; k++){
            subarrayMax = Math.max(subarrayMax, array[k]);
            subarrayMin = Math.min(subarrayMin, array[k]);
        }

        while(left > 0 && array[left-1] > subarrayMin) left--;
        while (right<array.length-1 && array[right+1] < subarrayMax) right++;
        return right-left+1;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[] { 1, 2, 5, 3, 7, 10, 9, 12 }));
        System.out.println(sort(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
        System.out.println(sort(new int[] { 1, 2, 3 }));
        System.out.println(sort(new int[] { 3, 2, 1 }));

    }
}
