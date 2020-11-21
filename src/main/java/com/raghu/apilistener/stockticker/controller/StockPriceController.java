package com.raghu.apilistener.stockticker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/stock")
public class StockPriceController {
	
	@GetMapping(value="/price", consumes = "application/json", produces = "application/json")
	public String stockPrice() {
		
		return "";
	}
}
