package dafe.springframework.beerservice;

public class Solution12 {

    public static int addDigits(int num) {
        //problem statement
        //input is an integer
        //add all digits in the integer until the result has only one digit
        //return the result


        //solution plan
        //initialize a result variable
        //convert the input to char array
        //loop over the char array and add digits
        //return the result if it is only one digit
        //if num is 893
        //first result = 893%10=3
        //first num = 893/10 =89.3
        //second result = 89%10 = 3+9 =12
        //second num = 89/10 = 8.9
        //third result = 8%10 = 12+8 =20
        //third num = 8/10=0.8
        int result = 0;
        while (num > 0) {
            result += num % 10;
            System.out.println("This is the first result : " + result);
            num = num / 10;
            System.out.println("This is the first num : " + num);

            if (num == 0 && result > 9) {
                num = result;
                System.out.println("This is the second num : " + num);
                System.out.println("This is the second result : " + result);
                result = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("This is the result of Digital Root : " + addDigits(893));
    }
}