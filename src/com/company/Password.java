//Shirley Li 10/10/19 , not finished yet
// Create a very basic password generator
// that will create a password based on a user’s name and age
package com.company;
import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("First name: ");
        String first = input.nextLine();
        System.out.println("Middle name: ");
        String middle = input.nextLine();
        System.out.println("Last name: ");
        String last = input.nextLine();
        System.out.println("Age: ");
        String age = input.nextLine();
        upper(first);
        upper(middle);
        upper(last);
    }
    private static void upper(String a){
        System.out.print(a.substring(a.length()/2,a.length()/2+1).toUpperCase());
    }
}
