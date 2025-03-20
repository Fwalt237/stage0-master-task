package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String revertNumber = String.valueOf(number);
        StringBuilder builder = new StringBuilder();
        builder.append(revertNumber);
        builder.reverse();
        int revertedNumber = Integer.parseInt(builder.toString());
        System.out.println(revertedNumber);
    }
}

