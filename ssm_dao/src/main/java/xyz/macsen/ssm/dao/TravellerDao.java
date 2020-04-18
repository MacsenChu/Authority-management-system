package xyz.macsen.ssm.dao;

import org.apache.ibatis.annotations.Select;
import xyz.macsen.ssm.domain.Traveller;

import java.util.List;

public interface TravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId = #{ordersId})")
    List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
