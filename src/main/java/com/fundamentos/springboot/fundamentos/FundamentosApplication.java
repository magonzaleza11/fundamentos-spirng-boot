package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//Inyeccion de dependencia
	private ComponentDependency componentDependency;

	public FundamentosApplication(ComponentDependency componentDependenc){
		this.componentDependency = componentDependenc;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	//Usada como implementacion
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
	}
}