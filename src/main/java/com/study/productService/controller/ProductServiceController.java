package com.study.productService.controller;

import com.study.productService.entity.Product;
import com.study.productService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
    @Autowired
    private ProductRepository m_repository;

    @PostMapping("/createProduct")
    void createCustomer(@RequestParam final String PN, @RequestParam final double price) {
        m_repository.save(new Product(PN, price));
    }

    @GetMapping("/getProducts")
    String getProducts() {
        String l_string = "";
        for (Product customer : m_repository.findAll()) {
            l_string += customer.toString() + " ";
        }
        return l_string;
    }

    @GetMapping("/getPID")
    String getPID(@RequestParam final String PN)
    {
        Product l_product = m_repository.findByPN(PN);

        System.out.println("send PID: " + l_product.id + " From " + l_product.PN);
        return l_product.getId();
    }
}
