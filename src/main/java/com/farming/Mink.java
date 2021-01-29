package com.farming;

public class Mink {

    private int number;
    private int ageInDays;
    private FurCoat color;

    public Mink(int number, int ageInDays, FurCoat color) {
        this.number = number;
        this.ageInDays = ageInDays;
        this.color = color;
    }



    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public FurCoat getColor() {
        return color;
    }

    public void setColor(FurCoat color) {
        this.color = color;
    }



    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }



}
