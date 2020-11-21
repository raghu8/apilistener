package com.raghu.apilistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raghu.apilistener.stockticker.csvfilecreator.CsvFileGenerator;
import com.raghu.apilistener.stockticker.dao.ReadAlphaAdvantageApi;

@SpringBootApplication
public class ApiListener {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApiListener.class, args);
		ReadAlphaAdvantageApi stockPrices = new ReadAlphaAdvantageApi();
		System.out.println(stockPrices.retrivingStockPrices("AAPL"));
//		CsvFileGenerator createExcel = new CsvFileGenerator();
//		createExcel.createCsv("AAPL", "NFLX", "AMZN");
		context.close();
	}

}
