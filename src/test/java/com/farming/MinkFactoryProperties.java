package com.farming;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;
import org.assertj.core.api.*;

import java.util.ArrayList;

class MinkFactoryProperties {
	private InfinityMinkCoatShop shop = new InfinityMinkCoatShop();

	@Property
	boolean gettingProperAmountOfCoats(@ForAll @IntRange(min = 1, max = 1000) int amount, @ForAll FurColor color) {
		ArrayList<FurCoat> coats = shop.multiOrderFurcoats(amount, color);
		return coats.size() == amount;
	}


}
