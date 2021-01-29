package com.farming;

import java.util.ArrayList;
import java.util.Optional;

public interface Campaign {
    public ArrayList<Optional<FurCoat>> orderFurcoats(int amount, FurColor color);
}
