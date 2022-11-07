package com.clota.databaseproduct.valueObject;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProductVersion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6618847036205628820L;

	private String productVersionId;
	private String productVersionName;
	private String productReleaseDate;

	public String getProductVersionId() {
		return productVersionId;
	}

	public void setProductVersionId(String productVersionId) {
		this.productVersionId = productVersionId;
	}

	public String getProductVersionName() {
		return productVersionName;
	}

	public void setProductVersionName(String productVersionName) {
		this.productVersionName = productVersionName;
	}

	public String getProductReleaseDate() {
		return productReleaseDate;
	}

	public void setProductReleaseDate(String productReleaseDate) {
		this.productReleaseDate = productReleaseDate;
	}

}
