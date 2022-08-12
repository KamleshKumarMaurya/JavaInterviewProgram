package com.inheritance;
class Demo2
{
	public int display() {
		return 1;
	}
}
class Demo3 extends Demo2{
	public int display() {
		return 2;
	}
}
public class OverridenMethod {

}

/*same access modifier it can be wider in child class from parent class but not lower 
	like => protected in parentclass -  public in child class
	
	2. same return type
*/