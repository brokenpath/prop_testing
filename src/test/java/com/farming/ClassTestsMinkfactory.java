package com.farming;

import net.jqwik.api.*;
import org.assertj.core.api.*;

import java.util.ArrayList;

class ClassTestsMinkfactory {

	@Example
	void buy5Coats() {
		ArrayList<FurCoat> result = new InfinityMinkCoatShop().multiOrderFurcoats(5, FurColor.brown);
		Assertions.assertThat(result.size()).isEqualTo(5);
	}

	@Example
	void getOneForFree(){
		InfinityMinkCoatShop shop = new InfinityMinkCoatShop();
		int everyNOneFree = 5;
		ArrayList<FurCoat> result = new OneFreeCampaign(shop, everyNOneFree)
				.orderFurcoats(everyNOneFree, FurColor.brown);

		Assertions.assertThat(result.size()).isEqualTo(everyNOneFree + 1);
	}

}
