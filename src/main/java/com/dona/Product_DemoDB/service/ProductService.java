package com.dona.Product_DemoDB.service;

import com.dona.Product_DemoDB.model.Product;
import com.dona.Product_DemoDB.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProduct() {
        return repo.findAll();
    }

    public Product getProductByID(int id){
        return repo.findById(id).orElseThrow(()->new RuntimeException("Product is not found" + id));
    }

    public  void addProduct(Product p){
        repo.save(p);
    }

    public Product updateProduct(int id , Product p) {
        Product product = getProductByID(id);

        product.setName(p.getName());
        product.setType(p.getType());
        product.setPlace(p.getPlace());
        product.setWarrenty(p.getWarrenty());

        return repo.save(product);
    }

    public void deleteProduct(int id){
        Product product = getProductByID(id);
        repo.delete(product);
    }

    public List<Product> getProduct(String name) {
        return repo.findByName(name);
    }
}
