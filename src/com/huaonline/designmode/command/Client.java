package com.huaonline.designmode.command;

public class Client {
	public static void main(String[] args) {
		Worker worker  = new Worker();
		Command c1 = new MeatCommand(worker);
		Command c2 = new ChickenCommand(worker);
		
		Waiter waiter = new Waiter();
		
		waiter.receive(c2);
		waiter.receive(c1);
		
		waiter.update();
	}
}
