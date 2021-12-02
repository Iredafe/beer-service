package dafe.springframework.beerservice.dsAndAlgo;

public class TandemBicycle {

    public static int tandemBicycle(int [] redShirtTeam, int [] blueShirtTeam, boolean fastest){

        if(!fastest){
            reverseArray(redShirtTeam);
        }
        return 1;
    }

    public static void reverseArray(int[] array){
        int left = 0; int right = array.length-1;

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        right--;
        left++;
    }


    public static void main(String[] args) {

        int redShirtTeam [] = {5, 5, 3, 9, 2};
        int blueShirtTeam [] ={3, 6, 7, 2, 1};
        boolean fastest = true;
    }
}
