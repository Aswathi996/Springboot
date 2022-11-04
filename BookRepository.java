package com.hnd.SpringBootTest4.Repository;

import com.hnd.SpringBootTest4.Entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {
    public BookEntity findById(Integer BookId);
}