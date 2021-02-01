package com.farming;

import java.util.ArrayList;

public class FurCoat {

    public FurCoat(ArrayList<Mink> material) {
        this.material = material;
    }

    public ArrayList<Mink> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<Mink> material) {
        this.material = material;
    }

    private ArrayList<Mink> material;
}
