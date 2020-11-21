package com.raghu.apilistener.serviceimpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.apilistener.model.StockPrice;
import com.raghu.apilistener.stockticker.dao.ReadAlphaAdvantageApi;

@Service
public class StockApiServiceImpl {

	@Autowired
	private StockPrice price;

	
}
