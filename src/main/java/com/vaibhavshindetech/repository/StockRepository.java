package com.vaibhavshindetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaibhavshindetech.entity.Stock;

/**
 * 
 * @author Vaibhav
 *
 */
@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	Stock findByStockName(String stockName);

}
