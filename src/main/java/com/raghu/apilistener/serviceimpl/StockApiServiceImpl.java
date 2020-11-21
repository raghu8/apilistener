package com.raghu.apilistener.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.apilistener.model.ListStocks;
import com.raghu.apilistener.model.StockDto;
import com.raghu.apilistener.model.StockPrice;
import com.raghu.apilistener.stockticker.dao.StockApiDao;

@Service
public class StockApiServiceImpl {

	@Autowired
	private StockApiDao priceMap;
	
	public StockPrice stockPrice(ArrayList<String> stockDto) {
		return priceMap.stockAndPrice(stockDto);
	}
	
	public ListStocks listOfStocks(ArrayList<ListStocks> stockLists) {
		
		return null;
	}
//	//stockAndPrice  --StockPrice
//	public StockApiDao nameAndPrice(StockDto stockDto) {
//		StockApiDao stockPrices = new StockApiDao();
//        StockDto stockSymbols = new StockDto();
//        ArrayList<String> stockList = new ArrayList<String>();
//        stockList.add("NVDA");
//        stockList.add("APPL");
//		stockSymbols.setStock(stockList);
//		System.out.println(stockSymbols.getStock().get(0));
//		System.out.println(stockPrices.stockAndPrice(stockSymbols).getPrice());
//		return null;
//	}
}
