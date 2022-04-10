package dafe.springframework.beerservice.OnsitePrep;

import java.util.Stack;

public class SimplifyPath {


    public static void main(String[] args) {
        String directory = "/foo/../test/../test/../foo//bar/./baz";

        System.out.println("This is the simplified version of the directory you entered : " + simplifyPath(directory));
    }

    private static String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String [] directories = path.split("/");

        for(String directory : directories){

            if(directory.equals(".") || directory.equals("")) continue;
            if(directory.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else{
                stack.push(directory);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String pathFragment : stack){
            result.append("/");
            result.append(pathFragment);
        }
        return result.length() > 0 ? result.toString() : "/";
    }
}
