package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.hibernate.id.insert.IdentifierGeneratingInsert;

import com.example.demo.Book;

public interface BookService 
{
public List<Book> getAllBooks();
public Optional<Book> getBookById(Integer bookId);
public Book createBook(Book book);

}

