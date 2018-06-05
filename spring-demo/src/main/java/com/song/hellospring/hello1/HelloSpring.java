package com.song.hellospring.hello1;

 
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class HelloSpring extends BaseBean{

	private User user;
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("restriction")
	 void init(){
		System.out.println("init");
	}

	@Override
	public String toString() {
		return "HelloSpring [user=" + user + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/song/hellospring/spring.xml");
		//User user = (User) context.getBean("user");
 		//System.out.println(user.toString());
 		HelloSpring spring = (HelloSpring) context.getBean("helloSpring");
 		spring.baseHello();
 		System.out.println(spring.toString());
 		context.close();
	}


	@Override
	void baseHello() {
		// TODO Auto-generated method stub
		System.out.println("hello spring");
	}


 
}
