package com.infyBoot1.FirstBootApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infyBoot1.FirstBootApp.Entity.Author;

//@Repository("authorRepository")
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
