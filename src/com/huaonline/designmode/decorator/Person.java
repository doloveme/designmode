package com.huaonline.designmode.decorator;

public class Person {
	private String name ;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.println(" ：装扮了"+name);
	}
}
