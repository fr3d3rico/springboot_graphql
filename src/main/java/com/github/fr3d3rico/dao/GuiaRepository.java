package com.github.fr3d3rico.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.github.fr3d3rico.types.Guia;

@Repository
public class GuiaRepository {
	
	@Autowired
	@Qualifier("jdbcSPG")
	private JdbcTemplate jdbcSPG;
	
	public Guia findByNumeroGuiaCompleto(Long numeroGuiaCompleto) {
		String sql = " select * from TABLE_NAME where FIELD_1 = ? ";
		
		try {
			Guia guia = this.jdbcSPG.queryForObject(sql, 
					new Object[]{numeroGuiaCompleto},
					new RowMapper<Guia>() {
						@Override
						public Guia mapRow(ResultSet rs, int rowNum) throws SQLException {
							
							Guia guia = new Guia(rs.getLong("FIELD_1"), rs.getString("FIELD_2"), rs.getString("FIELD_3"));
							
							return guia;
						}
					}
					);
			
			return guia;
		}
		catch(EmptyResultDataAccessException  empty) {
			return null;
		}
	}
	
	public List<Guia> findAll() {
		String sql = "select * from TABLE_NAME";
		
		return this.jdbcSPG.query(sql, (rs, rowNum) -> new Guia(rs.getLong("FIELD_1"), rs.getString("FIELD_2"), rs.getString("FIELD_3")) );
	}

}
