package com.tnsif.daythirteen;

public class Demo {

	public static void main(String[] args) {
		
		Product p=new Product();
		ProducerThread producer=new ProducerThread(p);
		ConsumerThread consumer=new ConsumerThread(p);
		
		producer.start();
		consumer.start();

	}

}
