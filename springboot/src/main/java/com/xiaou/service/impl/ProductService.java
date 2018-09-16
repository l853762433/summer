package com.xiaou.service.impl;

import java.util.List;

import com.xiaou.pojo.Product;

public interface ProductService {

	List<Product> selectAllProduct();

	void deleteProductById(Integer id);

	Product selectProductById(Integer id);

	void editProduct(Product product);

	void addProduct(Product product);


}
