package xyz.macsen.ssm.service;

import xyz.macsen.ssm.domain.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
