package com.xiaou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaou.mapper.ProductMapper;
import com.xiaou.pojo.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> selectAllProduct() {
		return productMapper.selectAllProduct();
	}
	@Override
	public void deleteProductById(Integer id) {
		productMapper.deleteProductById(id);
	}
	@Override
	public Product selectProductById(Integer id) {
		return productMapper.selectProductById(id);
	}
	@Override
	public void editProduct(Product product) {
		productMapper.editProduct(product);		
	}
	@Override
	public void addProduct(Product product) {
		productMapper.addProduct(product);		
	}
	

}
