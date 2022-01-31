package com.fundamentos.springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanTwoImplement;

@Configuration
public class MyBeanConfiguration {

	@Bean
	public MyBean beanOperation() {
		return new MyBeanTwoImplement();
	}

}
