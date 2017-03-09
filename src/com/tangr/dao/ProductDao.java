package com.tangr.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tangr.domain.Product;

public class ProductDao extends HibernateDaoSupport{

	public void save(Product product){
		System.out.println("ProductDao save product to database " + product );
		this.getHibernateTemplate().save(product);
	}
}
