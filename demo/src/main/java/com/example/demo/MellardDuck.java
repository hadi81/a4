/* Mellard Duck class extends Duck class and implements abstract display() method. Its contructor
initialized the fly and quack behavior for Mellard Duck i.e fly with wings and quack. */

package com.example.demo;

public class MellardDuck extends Duck{
	public MellardDuck()
	{
		flybehavior=new FlywithWings();
		quackbehavior= new Quack();
	}
	public String display()
	{
		return "I am Mellard Duck";
	}

}
