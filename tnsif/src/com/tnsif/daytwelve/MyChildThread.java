package com.tnsif.daytwelve;

public class MyChildThread implements Runnable {
	
	@Override
	public void run() {
		try {
			MyTask.sayHello(5);
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
