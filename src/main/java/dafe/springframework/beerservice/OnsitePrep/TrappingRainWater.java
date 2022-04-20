package dafe.springframework.beerservice.OnsitePrep;

public class TrappingRainWater {

    public static int trappedWater(int [] height){
        int n = height.length;
        int left = 1;
        int right = n-1;
        int leftMax = height[0];
        int rightMax = height[n-2];
        int trappedWaterVolume = 0;

    }

    public static void main(String[] args) {
        int [] height = {4,2,0,3,2,5};
        System.out.println("This is the volume of trapped rain water : " + trappedWater(height));
    }
}
