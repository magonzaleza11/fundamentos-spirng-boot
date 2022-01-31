package com.fundamentos.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencyImplement;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	// Inyeccion de dependencia
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependencyImplement myBeanDependency;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependenc,
			MyBean myBean, MyBeanWithDependencyImplement beanWithDependencyImplement) {
		this.componentDependency = componentDependenc;
		this.myBean = myBean;
		this.myBeanDependency = beanWithDependencyImplement;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	// Usada como implementacion
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanDependency.printWithDependency();
	}
}