package com.raghu.apilistener.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Stock implements Serializable {
	private static final long serialVersionUID = -6559704449944572769L;
	private ArrayList<String> stock;

	public ArrayList<String> getStock() {
		return stock;
	}

	public void setStock(ArrayList<String> stock) {
		this.stock = stock;
	}

}
