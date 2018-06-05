package com.song.hellospring.hello1;

import java.util.List;

public class Mythread implements Runnable {

	private List<User> list;
	public Mythread(List<User> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		for(User str:list) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
