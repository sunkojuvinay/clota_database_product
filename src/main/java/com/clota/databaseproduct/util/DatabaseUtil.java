package com.clota.databaseproduct.util;

import java.sql.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUtil {

	@Value("${spring.datasource.url}")
	private  String DB_URL;

	@Value("${spring.datasource.username}")
	private String USER;

	@Value("${spring.datasource.password}")
	private String PASS;

	public Connection getConnection() {

		Connection conn = null;
		// Open a connection = null;
		try {
			 conn = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}