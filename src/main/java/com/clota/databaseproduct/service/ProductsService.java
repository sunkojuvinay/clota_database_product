package com.clota.databaseproduct.service;

import java.util.List;

import com.clota.databaseproduct.valueObject.Product;
import com.clota.databaseproduct.valueObject.ProductVersion;

public interface ProductsService {
	
	public List<Product> getProductList();
    public List<ProductVersion> getProductVersions(String productId );
    
    
}
