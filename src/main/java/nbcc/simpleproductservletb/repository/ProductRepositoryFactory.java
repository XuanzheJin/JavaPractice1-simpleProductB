package nbcc.simpleproductservletb.repository;

public class ProductRepositoryFactory{
    public static ProductRepository create(){
        return new ProductJPARepository();
    }
}
