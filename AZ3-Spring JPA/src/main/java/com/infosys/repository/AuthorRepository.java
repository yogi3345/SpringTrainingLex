package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.domain.Author;

//@Repository("authorRepository")
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
