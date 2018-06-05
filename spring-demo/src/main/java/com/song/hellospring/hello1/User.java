package com.song.hellospring.hello1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("无参");
		this.name=name;
	}
	public User(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("有参");
		this.name=name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName:" +name);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory:"+beanFactory );
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean的destroy");
	}
	
	public void ini() {
		// TODO Auto-generated method stub
		System.out.println("bean ini");
	}
	public void des() {
		// TODO Auto-generated method stub
		System.out.println("bean des");
	}
}
