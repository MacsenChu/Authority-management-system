package xyz.macsen.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.macsen.ssm.dao.OrdersDao;
import xyz.macsen.ssm.domain.Orders;
import xyz.macsen.ssm.service.OrderService;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrderService {

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {

        // 参数pageNum是页码值    参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
