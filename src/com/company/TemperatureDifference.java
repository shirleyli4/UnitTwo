package com.company;
import java.util.Scanner;
public class TemperatureDifference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first temperature: ");
        int first = input.nextInt();
        System.out.println("Enter the second temperature: ");
        int sec = input.nextInt();
        int change = sec-first;
        System.out.println("The temperature changed "+change+" degrrees.");

    }
}
