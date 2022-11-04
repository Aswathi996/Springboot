package com.hnd.SpringBootTest4.Entity;

import java.awt.print.Book;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import com.hnd.SpringBootTest4.DTO;



@Entity

public class BookEntity {
    @Id
    @GeneratedValue
    private Integer bookId;
    private String title;
    private String authorName;
    private LocalDate publishedYear;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(LocalDate publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private String publisher;
    private Long isbn;
    private Integer price;

}

    @Override
    public String toString() {
        return "BookDTO [bookId=" + bookId + ", title=" + title + ", authorName=" + authorName + ", publishedYear="
                + publishedYear + ", publisher=" + publisher + ",isbn = " + isbn + ", price=" + price "]";

    }

}