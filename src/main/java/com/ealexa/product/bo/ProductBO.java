package com.ealexa.product.bo;

import com.ealexa.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	
	public Product findProduct(int id);
}
