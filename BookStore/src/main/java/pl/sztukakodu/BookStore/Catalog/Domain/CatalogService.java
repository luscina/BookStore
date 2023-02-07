package pl.sztukakodu.BookStore.Catalog.Domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.sztukakodu.BookStore.Catalog.Domain.Book;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class CatalogService {

   //

    private final CatalogRepository catalogRepository;

    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public List<Book> findByTitle(String title){
        return catalogRepository.listAll().
                stream().
                filter(book -> book.title.startsWith(title)).
                collect(Collectors.toList());
    }

    public List<Book> findByAuthor(String author){
        return catalogRepository.listAll().
                stream().
                filter(book -> book.author.startsWith(author)).
                collect(Collectors.toList());
    }

}
