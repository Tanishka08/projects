package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Book;
import com.example.demo.Error.BookNotFoundException;
import com.example.demo.Error.ErrorMessage;
import com.example.demo.Service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1(BookNotFoundException b) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(b.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2(Exception e) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/books")
	public List<Book> getAll() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookById(@PathVariable Integer bookId) throws Exception {
		Optional<Book> book = bookService.getBookById(bookId);
		if (!book.isPresent()) {
			throw new BookNotFoundException("BooK Is Not Found With ID:" + bookId);
		}

		/* return bookService.getBookById(bookId); */
		return book;
	}

	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		book.setBookId(0);
		return bookService.createBook(book);

	}

	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book)

	{
		return bookService.createBook(book);

	}

	/*
	 * @DeleteMapping("/books/{bookId}") public void deleteById(@PathVariable
	 * Integer bookId)throws Exception { Optional<Book>
	 * book=bookService.getBookById(bookId); if(!book.isPresent()) { throw new
	 * BookNotFoundException("BooK Is Not Found With ID:" +bookId); }
	 * bookService.deleteBookById(bookId); }
	 * 
	 * @DeleteMapping("/books") public void deleteAll() { bookService.deleteAll(); }
	 */
}

//model mapper
