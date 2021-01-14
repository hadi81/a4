/* This class implements QuackBehavior interface for those ducks who can't quack */
package com.example.demo;

public class MuteQuack implements QuackBehavior {
	public MuteQuack()
	{
		
	}
	public String quack()
	{
		return "<<silence>>";
	}

}
