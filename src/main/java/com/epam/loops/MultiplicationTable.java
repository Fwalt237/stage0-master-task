package com.epam.loops;


import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for(int i=1; i<11; i++){
            System.out.println(numberTableToPrint+" * "+ i + " = "
                    + numberTableToPrint * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int numberTableToPrint = sc.nextInt();
        new  MultiplicationTable().printTable(numberTableToPrint);
    }
}


