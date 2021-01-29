package com.farming;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class MinkFarmShop {
    private HashMap<FurColor,ArrayList<Mink>> minks = new HashMap<>() ;


    //Could be null
    public MinkFarmShop(HashMap<FurCoat,ArrayList<Mink>> initialCapacity){
        for(FurColor color : FurColor.values()) {
            if (initialCapacity.containsKey(color) && initialCapacity.get(color) != null) {
                minks.put(color, initialCapacity.get(color));
            } else {
                minks.put(color, new ArrayList<>());
            }
        }
    }


    public void buyMinks(ArrayList<Mink> minks) {
        for (Mink mink: minks) {
            this.minks.get(mink.getColor());
        }
    }

    public void gasMinks(){
        minks.clear();
    }

    public Optional<FurCoat> getFurcoatIfAvailable(FurColor color){
        throw new NotImplementedException();
    }

    public ArrayList<FurCoat> orderFurcoats(int amount, FurColor color){
        throw new NotImplementedException();

    }


}
