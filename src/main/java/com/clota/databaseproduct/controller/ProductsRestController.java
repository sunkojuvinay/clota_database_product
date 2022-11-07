package com.clota.databaseproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clota.databaseproduct.business.ProductsBusiness;
import com.clota.databaseproduct.valueObject.Product;
import com.clota.databaseproduct.valueObject.ProductVersion;

@RestController
public class ProductsRestController {

	@Autowired
	ProductsBusiness productsBusiness;

	@GetMapping(path = "getProducts", produces = "application/json")
	public List<Product> getProducts() {

		return productsBusiness.getProductList();
	}

	@GetMapping(path = "getProductVersions", produces = "application/json")
	public List<ProductVersion> getProductVersions(@RequestParam String productId) {

		return productsBusiness.getProductVersions(productId);
	}
}
