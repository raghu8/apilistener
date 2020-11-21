package com.raghu.aplistener.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.raghu.apilistener.model.StockDto;
import com.raghu.apilistener.model.StockPrice;

@Service
@Component
public interface StockApiService {
	StockPrice stockPrice(StockDto stockDto);
}
