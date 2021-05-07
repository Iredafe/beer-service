package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class Solution2 {

    public static ArrayList<String> reverseArrayList(ArrayList<String> alist){

        //initialize arraylist for storing elements
         ArrayList<String> myArr = new ArrayList<>();

         //append elements in reverse order
         for(int i= alist.size()-1; i>=0; i--){
             myArr.add(alist.get(i));
         }
        return myArr;
    }
    // Iterate through all the elements and print
    public static void printElements(ArrayList<String> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }

    public static void main(String [] args){

        // Declaring arraylist without any initial size
        ArrayList<String> arrayli = new ArrayList<>();

        // Appending elements at the end of the list
        arrayli.add("Love");
        arrayli.add("Joy");
        arrayli.add("Peace");
        arrayli.add("Faith");
        System.out.print("Elements before reversing:");
        printElements(arrayli);
        arrayli = reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:");
        printElements(arrayli);
    }
}
