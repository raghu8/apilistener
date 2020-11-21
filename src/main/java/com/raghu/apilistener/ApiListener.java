package com.raghu.apilistener;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raghu.apilistener.model.StockDto;
import com.raghu.apilistener.stockticker.csvfilecreator.CsvFileGenerator;
import com.raghu.apilistener.stockticker.dao.StockApiDao;

@SpringBootApplication
public class ApiListener {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApiListener.class, args);
		StockApiDao stockPrices = new StockApiDao();
        StockDto stockSymbols = new StockDto();
        ArrayList<String> stockList = new ArrayList<String>();
        stockList.add("NVDA");
        stockList.add("APPL");
		stockSymbols.setStock(stockList);
		System.out.println(stockSymbols.getStock().get(0));
		System.out.println(stockPrices.stockAndPrice(stockSymbols).getPrice());
		context.close();
	}

}
