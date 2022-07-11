package dafe.springframework.beerservice.Grokking;

public class DutchFlag {

    private static int[] sort(int [] array){
    int low = 0; int high = array.length-1;

    for(int index=0; index<=high;){
        if(array[index] == 0){
            swap(array, index, low);
            index++;
            low++;
        }else if(array[index] == 1){
            index++;
        }else{
            swap(array, index, high);
            high--;
        }
    }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 1, 0 };
        sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[] { 2, 2, 0, 1, 2, 0 };
        DutchFlag.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");

    }
}
