package ru.sberbank.library;

import org.springframework.stereotype.Repository;
import ru.sberbank.library.configuration.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();

    public static void main(String[] args) throws SQLException {
        BookService addressService = new BookService();

        BookService bookService = new BookService();
        bookService.setName("White Fang");
        bookService.setAuthor("Jack London");
        bookService.setQuantity("2");
        bookService.setPublisher("Moscow-Publishment");
        bookService.setDate("2020-09-09");
        bookService.setGenre("roman");


        session.save(bookService);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
