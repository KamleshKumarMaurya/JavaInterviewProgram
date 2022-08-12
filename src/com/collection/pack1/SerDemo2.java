package com.collection.pack1;

import java.util.HashSet;
import java.util.Objects;

class B
{
	int i,j,k;
	B(int i, int j, int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	public String toString() {
		return "(i= "+i+",j= "+j+",k= "+k+" )";
	}

	@Override
	public int hashCode() {
		String hash = Integer.toString(i);
		hash += Integer.toString(j);
		hash += Integer.toString(k);
		System.out.println("hascode for "+this+" is "+hash.hashCode());
		return hash.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = i == ((B)obj).i && j == ((B)obj).j && k == ((B)obj).k;
		System.out.println("equals b/w "+this+" and "+obj+" is "+b );
		return b;
	}
	
	
}

public class SerDemo2 {
	public static void main(String[] args) {
		HashSet<B> set = new HashSet<>();
		set.add(new B(1,3,6));
		set.add(new B(1,3,6));
		set.add(new B(1,3,6));
		set.add(new B(1,5,6));
		set.add(new B(1,7,6));
		set.stream().forEach((o1) -> System.out.println(o1));
		
	}

}
