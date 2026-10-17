package nbcc.simpleproductservletb.repository;

import nbcc.simpleproductservletb.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product get(Long id);
    void insert(Product product);
    void update(Product product);
    void delete(long id);
}
