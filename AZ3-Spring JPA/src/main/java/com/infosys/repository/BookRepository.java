package com.infosys.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	List<Book> findByBookPriceIn(List<Double> prices);

	List<Book> findByBookPriceIn(List<Double> prices, Sort sort);
}
