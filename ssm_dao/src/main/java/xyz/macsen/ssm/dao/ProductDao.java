package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Select;
import xyz.macsen.ssm.domain.Product;

import java.util.List;

public interface ProductDao {

    // 根据id查询产品
    @Select("select * from product where id = #{id}")
    Product findById(String id) throws Exception;

    // 查询所有的产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    // 添加产品
    @Insert("insert into product(productNum, productName, cityName, departureTime, productPrice, productDesc, productStatus) values(#{productNum}, #{productName}, #{cityName}, #{departureTime}, #{productPrice}, #{productDesc}, #{productStatus})")
    void save(Product product);

}
