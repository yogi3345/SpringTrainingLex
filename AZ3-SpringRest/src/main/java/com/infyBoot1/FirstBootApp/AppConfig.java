package com.infyBoot1.FirstBootApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.infyBoot1.FirstBootApp")
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