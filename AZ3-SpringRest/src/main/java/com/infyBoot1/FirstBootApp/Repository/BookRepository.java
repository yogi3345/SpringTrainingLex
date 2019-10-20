package com.infyBoot1.FirstBootApp.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infyBoot1.FirstBootApp.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	List<Book> findByBookPriceIn(List<Double> prices);

	List<Book> findByBookPriceIn(List<Double> prices, Sort sort);
}
