/* Abstract class for different types of ducks which contains two behavior i.e Flying Behavior and 
Quack behavior. It has instances of FlyingBehavior and QuackBehavior interfaces and call duck specific
flying and quack through these instances. */
package com.example.demo;

public abstract class Duck {
	FlyingBehavior flybehavior;
	QuackBehavior quackbehavior;
	public Duck()
	{
		
	}
	public abstract String display();
	/* Calls fly() method for particular duck */
	public String PerformFly()
	{
		String flyb;
		flyb=flybehavior.fly();
		return flyb;
	}
	/* Calls quack() method for pariticular duck */
	public String PerformQuack()
	{
		String quackb;
		quackb=quackbehavior.quack();
		return quackb;
	}
	/* Method for duck swimming */
	public String swim()
	{
		return "I can swim";
	}
	/* Dynamically setting the Flying Behavior */
	public void setFlyBehavior(FlyingBehavior fb)
	{
		flybehavior=fb;
	}
	/* Dynamically setting quack behavior */
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackbehavior=qb;
	}

}
