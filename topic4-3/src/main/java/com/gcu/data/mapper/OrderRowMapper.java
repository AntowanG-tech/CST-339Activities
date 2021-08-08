package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.data.entity.OrderEntity;

public class OrderRowMapper implements RowMapper<OrderEntity> {

	@Override
	public OrderEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		//create an instance of an OrderEntity, using the appropriate getter method for each column on the rs method. Populates each default constructor method argument. The new instance
		//of an OrderEntity should be returned.
		
		
		return new OrderEntity(rs.getLong("ID"), rs.getString("ORDER_NO"), rs.getString("PRODUCT_NAME"), rs.getFloat("PRICE"), rs.getInt("QUANTITY"));
	}

}
