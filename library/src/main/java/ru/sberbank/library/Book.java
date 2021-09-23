package ru.sberbank.library;


import org.slf4j.Logger;
import ru.sberbank.library.controller.BookController;

//@Entity
public class Book {
    //    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private String author;
    private String name;
    private String publisher;
    private String date;
    private String genre;
    private Integer id;


    public Book(String name, String author, String publisher, String date, String genre) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.publisher = publisher;
        this.genre = genre;
    }

    public static Logger getLogger(Class<BookController> bookControllerClass) {
        return null;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthor(String name) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPublisher(String Publisher) {
        this.publisher = publisher;
    }

}
