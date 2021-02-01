package com.farming;

import java.util.ArrayList;
import java.util.Optional;

public class InfinityMinkCoatShop {
    public Optional<FurCoat> getFurcoatIfAvailable(FurColor color){
        ArrayList<Mink> minks = new ArrayList<>();
        switch (color){
            case black:
                for(int i = 0 ; i < 50; i++) minks.add(new Mink(i, 360, FurColor.black));
                break;
            case brown:
                for(int i = 0 ; i < 50; i++) minks.add(new Mink(i, 360, FurColor.brown));
                break;
            case silver:
                for(int i = 0 ; i < 60; i++) minks.add(new Mink(i, 330, FurColor.silver));
                break;
            default:
                return Optional.empty();
        }
        return Optional.of(new FurCoat(minks));
    }

    public ArrayList<FurCoat> multiOrderFurcoats(int amount, FurColor color) {
        ArrayList<FurCoat> coats = new ArrayList<>();
        for(int i = 0 ; i < amount; i++){
            Optional<FurCoat> coat = getFurcoatIfAvailable(color);
            if (coat.isPresent()) coats.add(coat.get());
        }
        return coats;
    }
}
