package pl.sztukakodu.BookStore.Catalog.Domain;

import java.util.List;

public interface CatalogRepository {
    List<Book> listAll();

}
