package com.company;
import java.util.Scanner;
public class SeparatingDigits {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter two ineger");
        int numa = input.nextInt();
        int numb = input.nextInt();
        System.out.println("this is the integer part " + a(numa,numb));
        System.out.println("this is the reminder part " + b(numa,numb));
        /*c:Use the methods developed in parts (a) and (b) to write a method displayDigits
        that receives a four digit integer and displays it as a sequence of digits, separating each pair of digits by two spaces*/
        System.out.println("Plase enter in a 4 digits number");
        int fourd = input.nextInt();
        int first = a(fourd,1000);
        int second = a(fourd-first*1000,100);
        int third = a(fourd-first*1000-second*100,10);
        int four = b(fourd,10);
        System.out.println(first+"  "+second+"  "+ third+"  "+ four);
    }
    private static int a (int a,int b){
        //Calculate the integer part of the quotient when integer a is divided by integer b.
        int num = (int)(a/b);
        return num;
    }
    private static int b (int a, int b){
        //Calculate the integer part of the quotient when integer a is divided by integer b.
        int num = a%b;
        return num;
    }
}
