package com.company;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point: ");
        double firx = input.nextDouble();
        System.out.println("Enter the y coordinate of the first point: ");
        double firy = input.nextDouble();
        System.out.println("Enter the x coordinate of the second point: ");
        double secx = input.nextDouble();
        System.out.println("Enter the y coordinate of the second point: ");
        double secy = input.nextDouble();
        double slope = (secy-firy)/(secx-firx);
        System.out.println("The distance between ("+firx+","+firy+") and ("+secx+","+secy+") is "+slope);
    }
}
