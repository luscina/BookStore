package pl.sztukakodu.BookStore.Catalog.Infrastucture;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;
import pl.sztukakodu.BookStore.Catalog.Domain.Book;
import pl.sztukakodu.BookStore.Catalog.Domain.CatalogRepository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
class BestsellerRepository implements CatalogRepository {
    private final Map<Long, Book> storage= new ConcurrentHashMap<>();

    public BestsellerRepository() {
        storage.put(1L, new Book(1L,"Harry Potter", "JK Rowling", 1998));
        storage.put(2L, new Book(2L,"Władca Pierścieni", "JRR Tolkien", 1888));
        storage.put(3L, new Book(3L,"Mężczyźni, którzy nienawidzą kobiet", "Steig Larson", 2005));
        storage.put(4L, new Book(4L,"Sezon Burz", "Andzej Spakowski", 2013));
    }

    @Override
    public List<Book> listAll() {
        return storage.values().stream().toList();
    }
}
