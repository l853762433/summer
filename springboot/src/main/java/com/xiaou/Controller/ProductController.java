package com.xiaou.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaou.pojo.Product;
import com.xiaou.service.impl.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/productList")
	public String productList(HttpServletRequest request) {
		List<Product>productList=productService.selectAllProduct();
		request.setAttribute("productList", productList);
		return "list";
	}
	
	@RequestMapping("product_delete/{id}")
	public String deletePrSoduct(@PathVariable Integer id) {
		productService.deleteProductById(id);
		return "redirect:/productList";
	}
	@RequestMapping("product_edit/{id}")
	public String productEdit(@PathVariable Integer id,HttpServletRequest request) {
		Product product=productService.selectProductById(id);
		request.setAttribute("product", product);
		return "add";
	}
	@RequestMapping("/product/edit/{id}")
	public String edit(@PathVariable Integer id,Product product) {
		product.setId(id);
		productService.editProduct(product);
		return "redirect:/productList";
	}
	@RequestMapping("/product/add")
	public String addProduct(Product product) {
		productService.addProduct(product);
		return "redirect:/productList";
	}
}
