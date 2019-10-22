package com.company;
import java.util.Scanner;
public class Courses {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the description of the course? ");
        String des=input.nextLine();
        int s1= des.indexOf(" ");
        int s2= des.indexOf(" ",s1+1);
        System.out.println("Department: "+des.substring(0,s1));
        System.out.println("Course Number:"+des.substring(s1,s2+1));
        System.out.println("Title: "+des.substring(s2+1));
    }

}
