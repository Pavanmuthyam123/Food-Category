package com.product.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Repository.ProductRepository;
import com.product.model.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> findAllProductsByCategory(String category){
        return productRepository.findByCategory(category);
    }
    

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
