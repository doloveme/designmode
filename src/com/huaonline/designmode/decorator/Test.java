package com.huaonline.designmode.decorator;

public class Test {
	public static void main(String[] args) {
		Person tim =new Person("Tim");
		TShirts ts = new TShirts();
		Tie tie = new Tie();
		ts.decorate(tim);
		tie.decorate(ts);
		tie.show();
	}
}
