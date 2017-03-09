package com.tangr.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tangr.domain.Product;
import com.tangr.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	private ProductService productService;

	private Product product = new Product();

	@Override
	public Product getModel() {
		return product;
	}

public String save() {
		
		System.out.println("ActionÖÐµÄSave" + product);
		productService.save(product);
		return NONE;
	}
	
}
