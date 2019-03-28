package com.nt.command;

import lombok.Data;

@Data
public class StudentCommand {
	private String sname;
	private String sadd;
	private String course="hyd";
	
	public StudentCommand() {
		System.out.println("StudentCommand::0-param constructor");
		System.out.println("This is 0-param Constructor");
	}

}
