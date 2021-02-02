package com.farming;

import java.util.ArrayList;
import java.util.Optional;

public class OneFreeSilverCampaign{

    public OneFreeSilverCampaign(InfinityMinkCoatShop shop, int everyNFree) {
        this.shop = shop;
        this.oneExtraPerN = everyNFree;
    }

    public final int oneExtraPerN;
    private InfinityMinkCoatShop shop;

    public ArrayList<FurCoat> orderFurcoats(int amount, FurColor color){
        ArrayList<FurCoat> coats = shop.multiOrderFurcoats(amount, color);
        if(amount >= oneExtraPerN){
            Optional<FurCoat> extraCoat =  shop.getFurcoatIfAvailable(FurColor.silver);
            extraCoat.map( e -> coats.add(e));
        }
        return coats;
    }
}
