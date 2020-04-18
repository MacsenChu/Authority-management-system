package xyz.macsen.ssm.service;

import xyz.macsen.ssm.domain.Orders;

import java.util.List;

public interface OrderService {

    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
