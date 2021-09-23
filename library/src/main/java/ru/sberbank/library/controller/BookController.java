package ru.sberbank.library.controller;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sberbank.library.Book;
import ru.sberbank.library.configuration.HibernateUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BookController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    public BookController() {

    }


    @RequestMapping("/book")
    public Book book(@RequestParam(value = "name", required = false, defaultValue = "Little Prince") String name,
                     @RequestParam(value = "author", required = false, defaultValue = "Little Prince") String author,
                     @RequestParam(value = "publisher", required = false, defaultValue = "Little Prince") String publisher,
                     @RequestParam(value = "date", required = false, defaultValue = "2001-12-08") String date,
                     @RequestParam(value = "genre", required = false, defaultValue = "Little Prince") String genre) throws SQLException {
        Book myBook = new Book(name, author, publisher, date, genre);
        Statement statement = connection.createStatement();
        String SQL = "INSERT INTO books (id, name, author, quantity, publisher, date, genre) VALUES (" + 1 + ",'" + myBook.getName() + "','" + myBook.getAuthor() + "'," + 1 + ",'" + myBook.getPublisher() + "','" + myBook.getDate() + "','" + myBook.getGenre() + "')";
        statement.execute(SQL);
        return myBook;

    }

    private static final String URL = "jdbc:postgresql://localhost:5432/books";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "fufapo65";
    private static Connection connection;

    public static final Logger logger = Book.getLogger(BookController.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateUtil.class);
    }


    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


}
