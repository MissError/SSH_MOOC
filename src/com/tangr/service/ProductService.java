package com.tangr.service;

import org.springframework.transaction.annotation.Transactional;

import com.tangr.dao.ProductDao;
import com.tangr.domain.Product;

@Transactional
public class ProductService {

	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void save(Product product) {
		System.out.println("ProductService.saveProduct");
		productDao.save(product);
	}

}
