package com.raghu.apilistener.stockticker.controller;


import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.apilistener.model.ListStocks;
import com.raghu.apilistener.model.StockDto;
import com.raghu.apilistener.serviceimpl.StockApiServiceImpl;
import com.raghu.apilistener.stockticker.dao.StockApiDao;

@RestController
@RequestMapping(path = "/stock")
public class StockPriceController {

	@Autowired
	private StockApiServiceImpl storkApiService;


	@GetMapping(value = "/price", consumes = "application/json", produces = "application/json")
	public ArrayList<ListStocks> stockPrice(@RequestBody StockDto stockName) {

		System.out.println(stockName.getStock());
		StockApiDao stockAndPrice = new StockApiDao();
		System.out.println(stockName.getStock());
		storkApiService.stockPrice(stockName.getStock()).getPrice();
		System.out.println("Failure point? "+storkApiService.stockPrice(stockName.getStock()).getPrice());
		
		return null;
	}
}
