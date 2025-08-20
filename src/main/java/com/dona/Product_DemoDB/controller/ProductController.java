package com.dona.Product_DemoDB.controller;

import com.dona.Product_DemoDB.model.Product;
import com.dona.Product_DemoDB.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Period;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/get")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }

    @GetMapping("/get/id/{id}")
    public Product getProductByID(@PathVariable int id){
        return service.getProductByID(id);
    }

    @GetMapping("/get/name/{name}")
    public List<Product> getProduct(@PathVariable String name){
        return service.getProduct(name);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody List<Product> p) {
        for (Product pro : p) {
            service.addProduct(pro);
        }
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable int id , @RequestBody Product p){
        return service.updateProduct(id , p);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
        return  "Product is successfully deleted from the list with id" + id;
    }
}
