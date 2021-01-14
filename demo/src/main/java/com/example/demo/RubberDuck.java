/* Rubber Duck class extends Duck class and implements abstract display() method. Its contructor
initialized the fly and quack behavior for Rubber Duck i.e fly no way and squeak. */

package com.example.demo;


public class RubberDuck extends Duck {
	public RubberDuck()
	{
		flybehavior=new FlyNoWay();
		quackbehavior= new Squeak();
	}
	public String display()
	{
		return "I am rubber duck";
	}

}
