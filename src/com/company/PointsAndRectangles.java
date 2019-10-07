package com.company;//Shirley li 9/27 practice for instantiation
import java.awt.*;
import java.util.*;
public class PointsAndRectangles {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the x coordinate:");
        int xcoord = input.nextInt();
        System.out.print("Enter the y coordinate:");
        int ycoord = input.nextInt();
        System.out.print("Enter the length:");
        int length = input.nextInt();
        System.out.print("Enter the width:");
        int width = input.nextInt();
        Point point = new Point(xcoord,ycoord);
        Dimension object = new Dimension(length,width);
        Rectangle rec = new Rectangle(point,object);
        System.out.println(point);
        System.out.println(object);
        System.out.println(rec);
    }
}
