package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class AreaOfRectangularRoom {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the length of the room in feet?");
        int length = scnr.nextInt();
        System.out.print("What is the width of the room in feet?");
        int width = scnr.nextInt();
        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        int squareFeet = (length*width);
        double squareMeters = (squareFeet*.09290304);
        String strSqrmetersrounded = String.format("%.3f", squareMeters);
        System.out.println("The area is \n" + (squareFeet) + " square feet\n" + (strSqrmetersrounded) + " square meters");

    }
}

