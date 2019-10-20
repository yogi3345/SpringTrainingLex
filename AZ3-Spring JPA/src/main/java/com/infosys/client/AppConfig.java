package com.infosys.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.infosys")
@EnableTransactionManagement
@Import({ PersistenceContext.class })
public class AppConfig {
	
	
	
	/*@Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
	@Bean
	JpaTransactionManager jpaTransactionManager() {
		return new JpaTransactionManager();
	}*/
}
