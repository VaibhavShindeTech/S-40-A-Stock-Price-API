package com.vaibhavshindetech.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Vaibhav
 *
 */

import org.springframework.stereotype.Service;

import com.vaibhavshindetech.entity.Stock;
import com.vaibhavshindetech.repository.StockRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StockService {
	@Autowired
	private StockRepository stockRepository;

	public Stock findStockPriceByStockName(String stockName) {
		log.info("findStockPriceByStockName() method of StockService");
		 Stock findByStockName = stockRepository.findByStockName(stockName);
		return findByStockName;
	}

	public Stock saveStockDetails(Stock stock) {
		log.info("saveStockDetails() method of StockService");
		return stockRepository.save(stock);
	}
}
