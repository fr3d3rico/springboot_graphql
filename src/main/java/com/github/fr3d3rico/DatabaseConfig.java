package com.github.fr3d3rico;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseConfig {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource.xxx_datasource")
	public DataSourceProperties getDataSourceSPGProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource.xxx_datasource")
	public DataSource getDataSourceSPG() {
		return getDataSourceSPGProperties().initializeDataSourceBuilder().build();
	}
	
	@Bean(name="jdbcSPG")
	public JdbcTemplate jdbcTemplateSPG() {
		return new JdbcTemplate(getDataSourceSPG()); 
	}
	
}