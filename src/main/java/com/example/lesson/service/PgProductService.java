package com.example.lesson.service;

import com.example.lesson.Exception.ProductNotFoundException;
import com.example.lesson.dao.ProductDao;
import com.example.lesson.entity.ProductRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgProductService implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<ProductRecord> findAll() {
        return productDao.findAll();
    }

    public ProductRecord findById(int id) {
        try {
            return productDao.findById(id);
        } catch (ProductNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int insert(ProductRecord productRecord) {
        return productDao.insert(productRecord);
    }

    public int update(ProductRecord productRecord) {
        return productDao.update(productRecord);
    }

    public int delete(int delete) {
        return productDao.delete(delete);
    }

}
