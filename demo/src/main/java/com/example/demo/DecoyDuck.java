/* This class is for decoy ducks which extends Duck class and implement abstract display method 
from parents class. 
The constructor intializes the behavior for decoy ducks i.e they can't fly and quack*/
package com.example.demo;


public class DecoyDuck extends Duck{
	public DecoyDuck()
	{
		flybehavior=new FlyNoWay();
		quackbehavior= new MuteQuack();
	}
	public String display()
	{
		return "I am decoy duck";
	}

}
