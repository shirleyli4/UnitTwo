//Shuzhou (Shirley) Li 10/23

//this program will output the square root of a word


import java.util.Scanner;

public class SquareWordRoot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your word:");

        String word = input.next();

        int length = word.length();

        //+0.5 because of rounding

        int sqrt = (int)(Math.sqrt(length)+0.5);//index of the sqrt letter

        String realsqrt = word.substring(sqrt,sqrt+1);

        System.out.println("The \"square root\" of "+word+" is "+ realsqrt);

    }



}

