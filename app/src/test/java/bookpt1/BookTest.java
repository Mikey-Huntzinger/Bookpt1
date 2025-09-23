package app.src.test.java.bookpt1;
import app.src.main.java.bookpt1.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;
    @BeforeEach
    void setUp() {
        book = new Book("title", "author", "genre", LocalDate.of(2024, 1, 1), 10.00);
    }
    @Test
    void getTitle() {
        assertEquals("title", book.getTitle());
    }
    @Test
    void setTitle() {
        book.setTitle("newTitle");
        assertEquals("newTitle", book.getTitle());
    }
    @Test
    void getAuthor() {
        assertEquals("author", book.getAuthor());
    }
    @Test
    void setAuthor() {
        book.setAuthor("newAuthor");
        assertEquals("newAuthor", book.getAuthor());
    }
    @Test
    void getGenre() {
        assertEquals("genre", book.getGenre());
    }
    @Test
    void setGenre() {
        book.setGenre("newGenre");
        assertEquals("newGenre", book.getGenre());
    }
    @Test
    void getPublishDate() {
        assertEquals(LocalDate.of(2024, 1, 1), book.getPublishDate());
    }
    @Test
    void setPublishDate() {
        LocalDate newDate = LocalDate.of(2023, 2, 3);
        book.setPublishDate(newDate);
        assertEquals(newDate, book.getPublishDate());
    }
    @Test
    void getPrice() {
        assertEquals(10.00, book.getPrice());
    }
    @Test
    void setPrice() {
        book.setPrice(20.00);
        assertEquals(20.00, book.getPrice());
    }
}
