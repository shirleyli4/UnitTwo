//Shirley Li 10/10/19, a little song for you without redundancy
package com.company;
import java.util.Scanner;
public class TheNameGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String first = input.nextLine();
        System.out.println("What is your last name?");
        String last = input.nextLine();
        lyric(first);
        lyric(last);
    }
    private static void lyric (String a){
        System.out.println(a+" "+a+", bo-B"+ a.substring(1));
        System.out.println("Banana-fana fo-F"+a.substring(1));
        System.out.println("Fee-fi-mo-M"+a.substring(1));
        System.out.println(a.toUpperCase()+"!");
        System.out.println("");
    }

}
