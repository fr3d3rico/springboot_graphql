package com.github.fr3d3rico.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.github.fr3d3rico.types.Item;

@Repository
public class ItemRepository {

	@Autowired
	@Qualifier("jdbcSPG")
	private JdbcTemplate jdbcSPG;
	
	public List<Item> findAllItem(Long id) {
		String sql = "select * from TABLE_NAME where FIELD_1 = ? ";
		
		return this.jdbcSPG.query(sql, 
					new Object[]{id}, 
					(rs, rowNum) -> new Item(rs.getLong("FIELD_1"), rs.getString("FIELD_2"), rs.getString("FIELD_3")) );
	}
	
}