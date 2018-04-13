package io.spring.framework.springInAction.Chapter3;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class DataSourceConfig {

	@Bean(destroyMethod="shutdown")
	@Profile("dev")
	public DataSource embededDataSource(){
		
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	}
	
	@Bean
	@Profile("prod")
	public DataSource jndiDataSource(){
		JndiObjectFactoryBean jofb = new JndiObjectFactoryBean();
		jofb.setJndiName("jdbc/myDS");
		jofb.setResourceRef(true);
		jofb.setProxyInterface(javax.sql.DataSource.class);
		return (DataSource) jofb.getObject();
	}
	
}

  