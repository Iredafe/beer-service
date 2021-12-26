package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskAssignments {


    public static ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks){

        return new ArrayList<>();
    }


    public static void main(String[] args) {
        int k =3;
        ArrayList<Integer> tasks = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 1, 4));

        System.out.println("This is the most optimal task assignment : " + taskAssignment(k, tasks));
    }
}
