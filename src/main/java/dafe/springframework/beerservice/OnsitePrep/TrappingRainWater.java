package dafe.springframework.beerservice.OnsitePrep;

public class TrappingRainWater {

    public static int trappedWater(int [] height){
        int n = height.length;
        int left = 1;
        int right = n-1;
        int leftMax = height[0];
        int rightMax = height[n-2];
        int trappedWaterVolume = 0;

        while (left <= right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    trappedWaterVolume+= leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    trappedWaterVolume+=rightMax - height[right];
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] height = {4,2,0,3,2,5};
        System.out.println("This is the volume of trapped rain water : " + trappedWater(height));
    }
}
