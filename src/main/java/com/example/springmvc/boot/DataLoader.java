package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Product product1 = new Product();
        product1.setName("Milkyway");
        product1.setDescription("The Milky Way bar is a chocolate-covered candy bar.");
        product1.setType("CANDIES");
        product1.setCategory("CHOCOLATE CANDY");
        product1.setPrice(1.59);

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Snickers");
        product2.setDescription("Snickers is a chocolate-covered candy bar.");
        product2.setType("CANDIES");
        product2.setCategory("CHOCOLATE CANDY");
        product2.setPrice(1.99);

        productRepository.save(product2);
    }
}
