package com.howto.demouser.controller;

import com.howto.demouser.exception.ResourceNotFoundException;
import com.howto.demouser.model.Book;
import com.howto.demouser.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // Marks this class as a REST controller
@RequestMapping("/api/v1/") // Base URL for all endpoints in this controller
public class BookController {

    @Autowired // Automatically injects the BookRepository bean
    private BookRepository bookRepository;

    // 1. CREATE: Create a new book
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // 2. READ: Get all books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // 3. READ: Get a single book by ID
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
        return ResponseEntity.ok(book);
    }

    // 4. UPDATE: Update an existing book
    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        // Find the existing book
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));

        // Update its details
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());

        // Save the updated book
        Book updatedBook = bookRepository.save(book);
        return ResponseEntity.ok(updatedBook);
    }

    // 5. DELETE: Delete a book
    @DeleteMapping("/books/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBook(@PathVariable Long id) {
        // Find the book to delete
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));

        // Delete it
        bookRepository.delete(book);

        // Return a confirmation response
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}