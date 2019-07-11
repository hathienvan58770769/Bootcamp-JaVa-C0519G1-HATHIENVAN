package products_manager.service;

import products_manager.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private  static Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "ZenPhone", 2000000, 10));

        products.put(2, new Product(2, "IPhone", 25000000, 5));

        products.put(3, new Product(3, "SamSung", 1200000, 20));

        products.put(4, new Product(4, "Sony", 3000000, 30));

        products.put(5, new Product(5, "BPhone", 7000000, 9));
    }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){

        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public  void update(int id, Product product){
        products.put(id, product);

    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}
