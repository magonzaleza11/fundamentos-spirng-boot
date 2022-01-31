package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependence{
	
	MyOperation myOperation;

	public MyBeanWithDependencyImplement(MyOperation myOperation) {
		super();
		this.myOperation = myOperation;
	}

	@Override
	public void printWithDependency() {
		int number = 1;
		System.out.println(myOperation.sum(number));
		System.out.println("Hola desde la implementacion de un bean con dependencia");
	}

}
