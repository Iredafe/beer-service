package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TaskAssignments {


    public static ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks){

        return new ArrayList<>();
    }

    public static HashMap<Integer, ArrayList<Integer>> getTaskDurationsToIndices(ArrayList<Integer> tasks){

        HashMap<Integer, ArrayList<Integer>> taskDurationsToIndices = new HashMap<>();
        for (int i=0; i<tasks.size(); i++){
            int taskDuration = tasks.get(i);
            if(taskDurationsToIndices.containsKey(taskDuration)){
                taskDurationsToIndices.get(taskDuration).add(i);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                taskDurationsToIndices.put(taskDuration, temp);
            }
        }
        return taskDurationsToIndices;
    }

    public static void main(String[] args) {
        int k =3;
        ArrayList<Integer> tasks = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 1, 4));

        System.out.println("This is the most optimal task assignment : " + taskAssignment(k, tasks));
    }
}
