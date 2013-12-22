package com.huaonline.designmode.command;

public class MeatCommand extends Command{

	public MeatCommand(Worker worker) {
		super(worker);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		mWorker.makeMeat();
	}

}
