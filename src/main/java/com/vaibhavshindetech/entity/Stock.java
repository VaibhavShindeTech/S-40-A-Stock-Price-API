package com.vaibhavshindetech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Vaibhav
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stock_dtls")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer stockId;
	private String stockName;
	private Double StockPrice;
}
