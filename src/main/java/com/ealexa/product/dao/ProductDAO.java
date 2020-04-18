package com.ealexa.product.dao;

import com.ealexa.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	
	Product read(int id);
	
	void upate(Product product);
	
	void delete(int id);
}
