package ro.uvt.controllers;

import org.springframework.web.bind.annotation.*;
import ro.uvt.models.Book;
import ro.uvt.repositories.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ro.uvt.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable long id) {
        return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
    }
}