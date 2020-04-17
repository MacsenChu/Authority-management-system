package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import xyz.macsen.ssm.domain.Product;

import java.util.List;

public interface ProductDao {

    // 查询所有的产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum, productName, cityName, departureTime, productPrice, productDesc, productStatus) values(#{productNum}, #{productName}, #{cityName}, #{departureTime}, #{productPrice}, #{productDesc}, #{productStatus})")
    void save(Product product);
}
