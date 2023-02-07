package pl.sztukakodu.BookStore.Catalog.Domain;

import java.util.StringJoiner;

public class Book {
    private Long id;
    public String title;
    String author;
    private Integer year;

    public Book(Long id, String title, String author, Integer year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("author='" + author + "'")
                .add("year=" + year)
                .toString();
    }
}
