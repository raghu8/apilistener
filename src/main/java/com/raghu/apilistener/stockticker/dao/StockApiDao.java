package com.raghu.apilistener.stockticker.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.raghu.apilistener.model.ListStocks;
import com.raghu.apilistener.model.StockPrice;

@Repository
public class StockApiDao {

	public Double retrivingStockPrices(String stockSymbol) {
		StringBuffer response = new StringBuffer();
		RestTemplate restTemplate = new RestTemplate();
		String stockLine = restTemplate
				.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" + stockSymbol
						+ "&interval=30min&outputsize=compact&apikey=VH6I5JD3Y9KYWRFH", String.class);
		StockPriceDao stockPrice = new StockPriceDao();
		System.out.println();
		response.append(stockLine);
		return stockPrice.latestStockPrice(response);
	}

	public ListStocks stockAndPrice(ArrayList<String> stockSymbols) {
		StringBuffer response = new StringBuffer();
		RestTemplate restTemplate = new RestTemplate();
		StockPrice stockPriceMap = new StockPrice();
		ListStocks listOfStocks = new ListStocks();
		
		stockSymbols.stream().forEach(stockSymbol -> {
			String stockLineOne = restTemplate
					.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol="
							+ stockSymbol + "&interval=30min&outputsize=compact&apikey=VH6I5JD3Y9KYWRFH", String.class);

			StockPriceDao stockPrice = new StockPriceDao();
			response.append(stockLineOne);
			HashMap<String, Double> stockPriceMapInsert = new HashMap<String, Double>();
			stockPriceMapInsert.put(stockSymbol.toString(), stockPrice.latestStockPrice(response));
			stockPriceMap.setPrice(stockPriceMapInsert);
			ArrayList<StockPrice> stockList = new ArrayList<StockPrice>();
			stockList.add(stockPriceMap);
			listOfStocks.setStockList(stockList);
		});
		return listOfStocks;
	}
}
