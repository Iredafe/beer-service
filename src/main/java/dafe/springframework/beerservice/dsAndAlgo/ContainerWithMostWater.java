package dafe.springframework.beerservice.dsAndAlgo;

public class ContainerWithMostWater {

    public static int maxArea(int[] height){
    int water = 0, leftPointer = 0, rightPointer = height.length-1;
    while(leftPointer < rightPointer){
        if(height[leftPointer]< height[rightPointer]){
            water = Math.max(water, height[leftPointer] * (rightPointer-leftPointer));
            leftPointer+=1;
        }else{
            water = Math.max(water, height[rightPointer] * (rightPointer-leftPointer));
            rightPointer-=1;
        }
    }
    return water;
    }


    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println("The max area is " + maxArea(height));
    }
}
