package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int firstDigit = number / 1000;
        int secondDigit = (number % 1000)/100;
        int thirdDigit = ((number % 1000)%100)/10;
        int fourthDigit = ((number % 1000)%100)%10;
        System.out.println(firstDigit+secondDigit+thirdDigit+fourthDigit);
    }
}
