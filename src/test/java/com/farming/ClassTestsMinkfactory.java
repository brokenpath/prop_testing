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

}
