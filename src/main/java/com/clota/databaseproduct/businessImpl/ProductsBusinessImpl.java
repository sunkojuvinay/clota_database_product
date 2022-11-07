package com.clota.databaseproduct.businessImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clota.databaseproduct.business.ProductsBusiness;
import com.clota.databaseproduct.service.ProductsService;
import com.clota.databaseproduct.valueObject.Product;
import com.clota.databaseproduct.valueObject.ProductVersion;

@Component
public class ProductsBusinessImpl implements ProductsBusiness {

	@Autowired
	ProductsService productsService;

	@Override
	public List<Product> getProductList() {
		List<Product> lst = productsService.getProductList();
		return lst;
	}

	@Override
	public List<ProductVersion> getProductVersions(String productId) {
		List<ProductVersion> lst = productsService.getProductVersions(productId);
		return lst;
	}

}
