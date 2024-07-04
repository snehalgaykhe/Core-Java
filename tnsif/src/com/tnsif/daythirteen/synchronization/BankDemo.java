package com.tnsif.daythirteen.synchronization;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Account a1=new Account(1123,"Snehal",35000);
		
		AccountThread t1 = new AccountThread(a1,23000);
		AccountThread t2 = new AccountThread(a1,33000);
		
		System.out.println(a1);
		System.out.println("------------------------------");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("------------------------------");
		System.out.println(a1);
	}

}
