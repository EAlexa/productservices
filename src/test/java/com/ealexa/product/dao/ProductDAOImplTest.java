package com.ealexa.product.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ealexa.product.dto.Product;

public class ProductDAOImplTest {
	
	@Test
	public void testCreate() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("Awesome");
		product.setPrice(800);
		dao.create(product);
		
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("iPhone", result.getName());
	}

}
