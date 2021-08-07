package com.example.authorsBookShelf.repository;

import com.example.authorsBookShelf.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author,Long> {

}
