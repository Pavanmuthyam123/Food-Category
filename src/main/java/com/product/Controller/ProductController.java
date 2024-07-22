package com.product.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.product.Service.ProductService;
import com.product.model.Product;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/product")
    Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping(value ="/productById/{category}")
    List<Product> getProductsByCategory(@PathVariable String  category) {
        return productService.findAllProductsByCategory(category);
    }
   
   
    	
}
