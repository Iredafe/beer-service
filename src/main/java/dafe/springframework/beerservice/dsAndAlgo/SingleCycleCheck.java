package dafe.springframework.beerservice.dsAndAlgo;

public class SingleCycleCheck {

    public static boolean singleCycleCheck(int [] array){

        int numberOfElementsVisited = 0;
        int currentIndex = 0;
        while (numberOfElementsVisited< array.length){
            if(numberOfElementsVisited > 0 && currentIndex== 0) return false;
            numberOfElementsVisited++;
            currentIndex = getCurrentIndex(currentIndex, array);
        }
        return currentIndex == 0;
    }

    public static int getCurrentIndex(int currentIndex, int [] array){
        int jump = array[currentIndex];
        int nextIndex = (jump + currentIndex) % array.length;
        return nextIndex >= 0 ? nextIndex : nextIndex + array.length;
    }


    public static boolean singleCycleCheckReview(int [] array){
    int counter =0;
    int currentIndex = 0;

    while(counter < array.length){
        if(counter > 0 && currentIndex==0) return false;
        counter++;
        currentIndex = getCurrentIndexReview(array, currentIndex);
    }
        return currentIndex == 0;
    }

    public static int getCurrentIndexReview(int[] array, int currentIndex){
        int jump = array[currentIndex];
        int nextIndex = (jump + currentIndex)% array.length;
        return nextIndex >=0 ? nextIndex : nextIndex + array.length;
    }

    public static void main(String[] args) {

        int[] input ={2, 3, 1, -4, -4, 2};
        System.out.println("Is singly cycle check? : " + singleCycleCheck(input));
        System.out.println("Is singly cycle check review? : " + singleCycleCheckReview(input));
    }
}
