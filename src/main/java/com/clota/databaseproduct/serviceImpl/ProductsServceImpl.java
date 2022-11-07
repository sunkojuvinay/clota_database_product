package com.clota.databaseproduct.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clota.databaseproduct.service.ProductsService;
import com.clota.databaseproduct.util.DatabaseUtil;
import com.clota.databaseproduct.valueObject.Product;
import com.clota.databaseproduct.valueObject.ProductVersion;

@Service
public class ProductsServceImpl implements ProductsService {

	@Autowired
	DatabaseUtil databaseUtil;

	@Override
	public List<Product> getProductList() {
		List<Product> lst = new ArrayList<Product>();


		Connection conn = databaseUtil.getConnection();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select *from dbo.product");
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String name = rs.getString("product_name");
				
				Product product = new Product();

				product.setProductName(name);
				lst.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lst;
	}

	@Override
	public List<ProductVersion> getProductVersions(String productId) {
		List<ProductVersion> lst = new ArrayList<ProductVersion>();
		
		Connection conn = databaseUtil.getConnection();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select *from dbo.product_version where product_id=" + productId);
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				
				ProductVersion productVersion = new ProductVersion();

				productVersion.setProductVersionId(rs.getString("product_version_id"));
				productVersion.setProductVersionName(rs.getString("product_version_name"));
				productVersion.setProductReleaseDate(rs.getString("release_date"));
				lst.add(productVersion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return lst;
	}
	

}
