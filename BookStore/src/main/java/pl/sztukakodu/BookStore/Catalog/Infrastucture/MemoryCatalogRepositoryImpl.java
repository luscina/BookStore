package pl.sztukakodu.BookStore.Catalog.Infrastucture;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.sztukakodu.BookStore.Catalog.Domain.Book;
import pl.sztukakodu.BookStore.Catalog.Domain.CatalogRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
@Primary
class MemoryCatalogRepositoryImpl implements CatalogRepository {
    private final Map<Long, Book> storage = new ConcurrentHashMap<>();

    public MemoryCatalogRepositoryImpl() {
        storage.put(1L, new Book(1L,"Pan Tadeusz", "Adam Mickiewicz", 1834));
        storage.put(2L, new Book(2L,"Ogniem i Mieczem", "Henryk Sienkiewicz", 1884));
        storage.put(3L, new Book(3L,"Chłopi", "Reymony", 1904));
        storage.put(4L, new Book(4L,"Pan Wołodyjowski", "Henryk Sienkiewicz", 1976));
    }


    @Override
    public List<Book> listAll() {
        return new ArrayList<>(storage.values());
    }
}
