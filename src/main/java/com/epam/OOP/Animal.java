package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    private String getFur(){
        return hasFur ? "a" : "no";
    }

    public String getDescription(){
        if(this.numberOfPaws ==1){
            return "This animal is mostly "+ this.color+".It has 1 paw and " +this.getFur()+" fur.";
        } else {
            return "This animal is mostly "+ this.color+".It has "+this.numberOfPaws+" paws and " +this.getFur()+" fur.";
        }
    }

}
