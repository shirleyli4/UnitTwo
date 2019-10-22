package com.company;
import java.util.Scanner;
public class FindThePower {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = input.nextDouble();
        System.out.println("Enter the exponent: ");
        double exp = input.nextDouble();
        System.out.println(base+"^"+exp+" = "+ Math.pow(base,exp));
    }
}
