package com.example.demo.Service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.Book;
import com.example.demo.dao.BookDao;
@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService
{
private BookDao bookDao;
@Transactional
@Override
public List<Book> getAllBooks() {
	
	return bookDao.findAll();
}
@org.springframework.transaction.annotation.Transactional
@Override
public Optional<Book> getBookById(Integer bookId)
{
	Optional<Book> book=bookDao.findById(bookId);
			return book;
		}
@Override
public Book createBook(Book book) {

	return bookDao.save(book);
}
@Override
public void deleteBookById(Integer bookId) 
{
	bookDao.deleteById(bookId);
	
}
@Override
public void deleteAll()
{
bookDao.deleteAll();
	
}

	}

