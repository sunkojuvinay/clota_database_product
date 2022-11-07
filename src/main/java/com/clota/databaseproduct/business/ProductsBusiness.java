package com.clota.databaseproduct.business;

import java.util.List;

import com.clota.databaseproduct.valueObject.Product;
import com.clota.databaseproduct.valueObject.ProductVersion;

public interface ProductsBusiness {

	public List<Product> getProductList();

	public List<ProductVersion> getProductVersions(String productId);

}
