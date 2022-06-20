package com.leo.microservice.cartservice.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBCreate {
	
	@Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
    
    @Bean
    public void createDbTable() {
        try (
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
        ) {

            String cartItemTable = "CREATE TABLE IF NOT EXISTS pocdb.cart_item ("
                    + "cart_item_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,"
                    + "product_id BIGINT DEFAULT NULL,"
                    + "quantity INTEGER NOT NULL,"
                    + "cart_id BIGINT NOT NULL,"
                    + "product_price DOUBLE DEFAULT NULL,"
                    + "cart_item_total_price double DEFAULT NULL,"
                    + "date_created datetime(6) DEFAULT NULL"
                    + ")";
            stmt.executeUpdate(cartItemTable);
            
            String cartTable = "CREATE TABLE IF NOT EXISTS pocdb.carts ("
                    + "cart_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,"
                    + "total_price DOUBLE NOT NULL,"
                    + "date_created datetime(6) DEFAULT NULL"
                    + ")";
            stmt.executeUpdate(cartTable);
            
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

}