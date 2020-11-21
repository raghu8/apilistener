package com.raghu.apilistener.model;

import java.util.HashMap;
import org.springframework.stereotype.Component;

@Component
public class StockPrice {
	private HashMap<String, Double> price;

	public HashMap<String, Double> getPrice() {
		return price;
	}

	public void setPrice(HashMap<String, Double> price) {
		this.price = price;
	}

}
