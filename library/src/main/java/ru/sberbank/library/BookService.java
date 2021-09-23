package ru.sberbank.library;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
@Service
public class BookService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "date")
    private Date date;
    @Column(name = "genre")
    private String genre;

    public BookService() {

    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGenre(String roman) {
        return genre;
    }

    public void setGenre(String name) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Bookservice{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",author='" + author + '\'' +
                ",quantity='" + quantity + '\'' +
                ",publisher='" + publisher + '\'' +
                ",date='" + date + '\'' +
                ",genre='" + genre + '\'' +
                '}';
    }

}

