package com.raghu.apilistener.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raghu.apilistener.model.ListStocks;
import com.raghu.apilistener.stockticker.dao.StockApiDao;

@Service
public class StockApiServiceImpl {

	@Autowired
	private StockApiDao priceMap;

	public ListStocks listOfStocks(ArrayList<String> stockDto) {
		return priceMap.stockAndPrice(stockDto);
	}
	
}
