package pl.sztukakodu.BookStore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sztukakodu.BookStore.Catalog.Application.CatalogController;
import pl.sztukakodu.BookStore.Catalog.Domain.Book;

import java.util.List;
@Component
public class ApplicationStartup implements CommandLineRunner {
    private final CatalogController catalogController;
    private final String title;

    private final String author;

    public ApplicationStartup(
            CatalogController catalogController,
            @Value("${bookStore.catalog.queryTitle}") String title,
            @Value("${bookStore.catalog.queryAuthor}") String author) {
        this.catalogController = catalogController;
        this.title = title;
        this.author = author;
    }

    @Override
    public void run(String... args) throws Exception {
        //List<Book> booksByTitle = catalogController.findByTitle(title);
        //booksByTitle.forEach(System.out::println);
        List<Book> booksByAuthors = catalogController.findByAuthor(author);
        booksByAuthors.forEach(System.out::println);
    }
}
