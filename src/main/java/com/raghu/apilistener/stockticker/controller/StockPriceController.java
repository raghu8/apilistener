package com.raghu.apilistener.stockticker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.apilistener.model.ListStocks;
import com.raghu.apilistener.model.StockDto;
import com.raghu.apilistener.serviceimpl.StockApiServiceImpl;

@RestController
@RequestMapping(path = "/stock")
public class StockPriceController {

	@Autowired
	private StockApiServiceImpl storkApiService;

	@GetMapping(value = "/price", consumes = "application/json", produces = "application/json")
	public ListStocks stockPrice(@RequestBody StockDto stockName) {
		return storkApiService.listOfStocks(stockName.getStock());
	}
}
