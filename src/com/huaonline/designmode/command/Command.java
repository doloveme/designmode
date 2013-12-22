package com.huaonline.designmode.command;

public abstract class Command {
	public abstract void run();

	protected Worker mWorker;

	public Command(Worker worker) {
		// TODO Auto-generated constructor stub
		this.mWorker = worker;
	}
}
