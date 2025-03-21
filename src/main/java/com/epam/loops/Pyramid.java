package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength-i; j++) {
                System.out.print(" ");
            }
            // Print the decreasing part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print the increasing part (excluding 1)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(7);
    }

}
