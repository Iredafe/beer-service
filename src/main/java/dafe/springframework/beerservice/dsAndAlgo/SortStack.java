package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStack {

    public static List<Integer> sortStack(List<Integer> stack){
    if(stack.isEmpty()) return stack;

    int topElement = stack.remove(stack.size()-1);

    sortStack(stack);
    insertIntoSortedStack(stack, topElement);
        return stack;
    }

    public static void insertIntoSortedStack(List<Integer> stack, int value){

        if(stack.isEmpty() || stack.get(stack.size()-1) <= value){
            stack.add(value);
            return;
        }

        int topElement = stack.remove(stack.size()-1);
        insertIntoSortedStack(stack, topElement);
        stack.add(topElement);
    }


    public static void main(String[] args) {
         List<Integer> stack = new ArrayList<>(Arrays.asList(-5, 2, -2, 4, 3, 1));

        System.out.println("This is the sorted stack : " + sortStack(stack));
    }
}
