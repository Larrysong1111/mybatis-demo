package com.song.hellospring.hello1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		StringBuilder str =new StringBuilder("A");
		for(int i=0;i<10;i++) {
			list.add(new User(str.append("A").toString()));
		}
		
		Mythread mythread = new Mythread(list);
		Thread thread = new Thread(mythread);
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.add(new User("bb"));
	}

}
