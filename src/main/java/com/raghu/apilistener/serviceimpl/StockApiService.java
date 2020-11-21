package com.raghu.apilistener.serviceimpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.apilistener.model.StockPrice;
import com.raghu.apilistener.stockticker.endpointlistener.ReadAlphaAdvantageApi;

@Service
public class StockApiService {
	@Autowired
	private StockPrice price;

	public StockPrice stockPrice() {
		ReadAlphaAdvantageApi retrivedStockPrice = new ReadAlphaAdvantageApi();
		HashMap<String, Double> stockPrice = new HashMap<String, Double>();
		
		return null;
	}
}
