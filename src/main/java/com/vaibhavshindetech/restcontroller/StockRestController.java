package com.vaibhavshindetech.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavshindetech.entity.Stock;
import com.vaibhavshindetech.service.StockService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Vaibhav
 *
 */
@RestController
@RequestMapping(value = { "/stock" })
@Slf4j
public class StockRestController {
	@Autowired
	private StockService stockService;

	@PostMapping(value = { "/save" })
	private ResponseEntity<Stock> saveStockDetails(@RequestBody Stock stock) {
		log.info("saveStockDetails() method of StockRestController");
		return new ResponseEntity<Stock>(stockService.saveStockDetails(stock), HttpStatus.CREATED);
	}

	@GetMapping(value = { "/price/{name}" })
	public Double findStockPriceByStockName(@PathVariable(value = "name") String stockName) {
		log.info("findStockPriceByStockName() method of StockRestController");
		return stockService.findStockPriceByStockName(stockName).getStockPrice();
	}
}
