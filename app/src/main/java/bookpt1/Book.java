package bookpt1;
import java.time.LocalDate;

public class Book {
    public int AUTHOR_,DUE_DATE_,ISBN_,PAGE_COUNT_,SUBJECT_TITLE_;
    private String author;
    private LocalDate dueDate;
    private String isbn;
    private int pageCount;
    private String subject;
    private String title;

    public Book(String author, LocalDate dueDate, String isbn, int pageCount, String subject, String title) {
        this.author = author;
        this.dueDate = dueDate;
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.subject = subject;
        this.title = title;
    }
        @Override
        public String toString() {
            return title + " by " + author + ", ISBN: " + isbn;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return pageCount == book.pageCount &&
                java.util.Objects.equals(author, book.author) &&
                java.util.Objects.equals(isbn, book.isbn) &&
                java.util.Objects.equals(subject, book.subject) &&
                java.util.Objects.equals(title, book.title);
        }

        public int hashCode() {
            return java.util.Objects.hash(author, isbn, pageCount, subject, title);
        }
        
        // Getters and Setters
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
}
