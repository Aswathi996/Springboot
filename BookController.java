package com.hnd.SpringBootTest4.Controller;


import com.hnd.SpringBootTest4.DTO.BookDTO;
import com.hnd.SpringBootTest4.Entity.BookEntity;
import com.hnd.SpringBootTest4.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookController {
    @Autowired
private BookService Service;

    @PostMapping (value="/addBook")
    public String addBookDDetails(@RequestBody BookDTO BookDTO) {
    return service.saveBookDetails(BookDTO);
    }

    @PostMapping(value="/addBooks")
    public List<Book> addBookDetails(@RequestBody List<Book> book){
        return service.saveBookDetails(books);
    }
    @GetMapping(value="/books")
    public List<Book> findAllBooks(){
        return  service.getBookDetails();
    }
    @DeleteMapping(value="/deleteBookDetails")
    public String deleteBookDetails(@PathVariable Integer bookId){
        return service.deleteBookDetails(bookId);
    }
    @PutMapping(value="/updateBookDetails")
    public Book updateBookDetails(@RequestBody BookDTO BookDTO){
        return service.updateBookDetails(book);
    }
}

