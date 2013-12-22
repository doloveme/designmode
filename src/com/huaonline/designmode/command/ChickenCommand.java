package com.huaonline.designmode.command;

public class ChickenCommand extends Command {

	public ChickenCommand(Worker worker) {
		super(worker);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		mWorker.makeChicken();
	}

}
