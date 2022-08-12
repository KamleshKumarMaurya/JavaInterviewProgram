package com.collection.pack1;

import java.util.HashSet;
import java.util.Objects;

class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString() {
		return "(i = "+i+" )";
	}
	
	public int hashCode()
	{
		return i;
	}
	
	public boolean equals(Object a1) {
		return i == ((A)a1).i;
	}
}

public class SetDemo1 { 
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		System.out.println(set);
	}

}
