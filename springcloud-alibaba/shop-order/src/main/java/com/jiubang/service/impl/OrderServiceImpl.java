package com.jiubang.service.impl;

import com.jiubang.dao.OrderDao;
import com.jiubang.domain.Order;
import com.jiubang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    public void save(Order order){
        orderDao.save(order);
    }
}
