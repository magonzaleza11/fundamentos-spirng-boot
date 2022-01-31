package com.fundamentos.springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanTwoImplement;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencyImplement;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;
import com.fundamentos.springboot.fundamentos.bean.MyOperationImplement;

@Configuration
public class MyBeanConfiguration {

	@Bean
	public MyBean beanOperation() {
		return new MyBeanTwoImplement();
	}

	@Bean
	public MyOperation beanOperationOp() {
		return new MyOperationImplement();
	}

	@Bean
	public MyBeanWithDependencyImplement beanOperationWithDependency(MyOperation myOperation) {
		return new MyBeanWithDependencyImplement(myOperation);
	}
}
