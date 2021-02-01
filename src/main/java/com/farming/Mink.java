package com.farming;

public class Mink {

    private int number;
    private int ageInDays;
    private FurColor color;

    public Mink(int number, int ageInDays, FurColor color) {
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

    public FurColor getColor() {
        return color;
    }

    public void setColor(FurColor color) {
        this.color = color;
    }



    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }



}
