package com.hnd.SpringBootTest4.DTO;

import java.time.LocalDate;
import java.util.Set;

public class BookDTO {
    private Integer bookId;
    private String title;
    private String authorName;

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

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
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

    private String publishedYear;
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
