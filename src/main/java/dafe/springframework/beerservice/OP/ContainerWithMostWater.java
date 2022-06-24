package dafe.springframework.beerservice.OP;

public class ContainerWithMostWater {
    private static int containerWithMostWater(int[] height) {
    int left = 0; int right= height.length-1; int maximumArea = 0;

    while(left<right){
        maximumArea = Math.max(maximumArea, Math.min(height[left], height[right])
        * (right-left));
        if(height[left]< height[right]) left++;
        else right--;
    }
    return maximumArea;
    }


    public static void main(String[] args) {
        int [] input = {1,8,6,2,5,4,8,3,7};
        System.out.println("This is the maximum area : " + containerWithMostWater(input));
    }


}
