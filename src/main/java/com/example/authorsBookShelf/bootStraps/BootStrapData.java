package com.example.authorsBookShelf.bootStraps;

import com.example.authorsBookShelf.domain.Author;
import com.example.authorsBookShelf.domain.Book;
import com.example.authorsBookShelf.repository.AuthorRepository;
import com.example.authorsBookShelf.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Mthembu");
        Book book = new Book("When I see you","YZH90NGf");

        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book);


        Author rod = new Author("Rod","Johnson");
        Book book1 = new Book("The sky is blue","MMXS230S8uSh");

        rod.getBooks().add(book1);

        book1.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(book1);


        System.out.println("Starting in BootStrap..");

        System.out.println("Number of books: "+bookRepository.count());


    }
}
