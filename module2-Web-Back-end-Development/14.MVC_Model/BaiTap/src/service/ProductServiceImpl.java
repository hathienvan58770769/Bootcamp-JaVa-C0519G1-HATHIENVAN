package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    public static Map<Integer, Product > products ;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Sam Sung A7","32GB", 6990000, 12));
        products.put(2, new Product(2, "Apple Iphone X", "128GB",2500000, 5));
        products.put(3, new Product(3, "Xiaomi redmi note 7","16GB", 7590000, 8));
        products.put(4, new Product(4, "Samsung S7+","64GB", 1349900, 7));
        products.put(5, new Product(5, "Asus zenfone max pro m1 ","8GB",4900000 , 10));
        products.put(6, new Product(6, "realme 2 pro","16GB", 3990000, 18));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
