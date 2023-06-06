package com.example.lesson.service;

import com.example.lesson.entity.ProductRecord;

import java.util.List;

public interface ProductService {

    public List<ProductRecord> findAll();

    public ProductRecord findById(int id);

    public int insert(ProductRecord productRecord);

    public int update(ProductRecord productRecord);

    public int delete(int delete);

}
