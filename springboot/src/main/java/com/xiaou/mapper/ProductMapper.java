package com.xiaou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xiaou.pojo.Product;

public interface ProductMapper {
	@Select("select * from product")
	List<Product> selectAllProduct();
	@Delete("delete  from product where id = #{value}")
	void deleteProductById(Integer id);
	@Select("select * from product where id = #{value}")
	Product selectProductById(Integer id);
	@Update("update product set name=#{name},spec=#{spec},stock=#{stock},price=#{price} where id = #{id}")
	void editProduct(Product product);
	@Insert("insert into product (name,spec,stock,price)values(#{name},#{spec},#{stock},#{price})")
	void addProduct(Product product);
}
