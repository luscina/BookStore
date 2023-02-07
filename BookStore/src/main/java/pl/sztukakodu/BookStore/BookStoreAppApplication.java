package pl.sztukakodu.BookStore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sztukakodu.BookStore.Catalog.Application.CatalogController;
import pl.sztukakodu.BookStore.Catalog.Domain.Book;
import pl.sztukakodu.BookStore.Catalog.Domain.CatalogService;

import java.util.List;

@SpringBootApplication
public class BookStoreAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(BookStoreAppApplication.class, args);

	}



}
