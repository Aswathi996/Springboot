package com.hnd.SpringBootTest4.Service;

import com.hnd.SpringBootTest4.DTO.BookDTO;

public interface BookService{
    public BookDTO addBook(BookDTO BookDTO);
    public BookDTO getBook(Integer Id);
    public void updateBook(Integer Id);
    public void deleteBook(Id Integer);
}


