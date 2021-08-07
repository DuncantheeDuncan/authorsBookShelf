package com.example.authorsBookShelf.repository;

import com.example.authorsBookShelf.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
