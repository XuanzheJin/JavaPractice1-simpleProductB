package nbcc.simpleproductservletb.viewmodel;

import nbcc.simpleproductservletb.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListViewModel {
    private List<Product> products;
    public ProductListViewModel() {
        products = new ArrayList<>();
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
