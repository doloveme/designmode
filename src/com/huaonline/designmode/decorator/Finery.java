package com.huaonline.designmode.decorator;

public class Finery extends Person {
	protected Person item;

	public void decorate(Person item) {
		this.item = item;

	}

	public void show() {
		if (item != null)
			item.show();

	}
}
