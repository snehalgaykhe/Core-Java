package com.tnsif.daythirteen;

public class ProducerThread extends Thread{
	Product p;
	
	public ProducerThread(Product p) {
		super();
		this.p=p;
	}

	public void run() {
		while(true) {
			try {
				p.put();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
