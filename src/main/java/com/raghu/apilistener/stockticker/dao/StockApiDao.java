package com.raghu.apilistener.stockticker.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.raghu.apilistener.model.StockDto;
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

	public StockPrice stockAndPrice(StockDto stockSymbols) {
		StringBuffer response = new StringBuffer();
		RestTemplate restTemplate = new RestTemplate();
		StockPrice stockPriceMap = new StockPrice();
		stockSymbols.getStock().stream().forEach(stockSymbol -> {
			String stockLineOne = restTemplate
					.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol="
							+ stockSymbol + "&interval=30min&outputsize=compact&apikey=VH6I5JD3Y9KYWRFH", String.class);

			StockPriceDao stockPrice = new StockPriceDao();
			response.append(stockLineOne);
			HashMap<String, Double> stockPriceMapInsert = new HashMap<String, Double>();
			stockPriceMapInsert.put(stockSymbol.toString(), stockPrice.latestStockPrice(response));
			stockPriceMap.setPrice(stockPriceMapInsert);
		});
		return stockPriceMap;
	}
}
