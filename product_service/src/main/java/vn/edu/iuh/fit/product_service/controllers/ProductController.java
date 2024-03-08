package vn.edu.iuh.fit.product_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.product_service.models.Product;
import vn.edu.iuh.fit.product_service.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") long id){
        return productRepository.findById(id).get();
    }

    @DeleteMapping("/product/{id}")
    public boolean deleteProductById(@PathVariable("id") long id){
        productRepository.deleteById(id);
        return true;
    }
}
