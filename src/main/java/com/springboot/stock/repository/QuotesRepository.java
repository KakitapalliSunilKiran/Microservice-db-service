package com.springboot.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.stock.model.Quote;
import com.springboot.stock.model.Quotes;

//@Repository
public interface QuotesRepository extends JpaRepository<Quote, Integer> {

	List<Quote> findByUserName(String username);
	//select * from quotes where userame=username

		//1 Ramu HDFC
		//2 Ramu SBI
		//3 Ramu ICICI
		//4 Ramu JIO
		//5 Ramu Airtel

}
