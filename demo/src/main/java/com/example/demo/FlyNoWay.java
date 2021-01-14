/* This class implements FlyingBehavior interface for those ducks who can't fly*/
package com.example.demo;


public class FlyNoWay implements FlyingBehavior {
	public FlyNoWay()
	{
		
	}
	public String fly()
	{
		return "I can't fly";
	}

}
