package com.tyss.trainingmaintenance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class OrmConfig {
	@Bean
	public LocalEntityManagerFactoryBean ormConfiguration() {
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("Edific_Tech_C");
		return bean;
	}
}
