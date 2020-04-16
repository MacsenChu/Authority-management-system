package xyz.macsen.ssm.dao;

import xyz.macsen.ssm.domain.Product;

import java.util.List;

public interface ProductDao {

    // 查询所有的产品信息
    public List<Product> findAll() throws Exception;
}
