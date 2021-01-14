/* RedHeadx Duck class extends Duck class and implements abstract display() method. Its contructor
initialized the fly and quack behavior for RedHead Duck i.e fly with wings and quack. */
package com.example.demo;

public class RedheadDuck extends Duck{
	public RedheadDuck()
	{
		flybehavior=new FlywithWings();
		quackbehavior= new Quack();
	}
	public String display()
	{
		return "I am redhead duck";
	}

}
