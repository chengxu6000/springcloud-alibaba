package com.jiubang.service.impl;

import com.jiubang.dao.ProductDao;
import com.jiubang.domain.Product;
import com.jiubang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
