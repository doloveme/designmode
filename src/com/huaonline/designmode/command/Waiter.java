package com.huaonline.designmode.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	List<Command> command_list = new ArrayList<Command>();
	
	public void receive(Command com){
		command_list.add(com);
	}
	
	
	public void update(){
		for(Command com : command_list)
			com.run();
	}
}
