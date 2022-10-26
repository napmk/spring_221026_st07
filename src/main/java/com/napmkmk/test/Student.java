package com.napmkmk.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private String name;
	private int age;
	

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	



	@Override
	public void afterPropertiesSet() throws Exception { // 빈의 속성 만들어질때 
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet 호출");
		
	}
	
	@Override
	public void destroy() throws Exception { // 빈이 삭제 소멸 될때 호출됨
		// TODO Auto-generated method stub
		System.out.println("destroy 호출");
	}
	
	
	

}
