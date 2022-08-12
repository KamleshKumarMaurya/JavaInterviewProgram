package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

class A{
    int i;
    A(int i){
            this.i= i;
    }
    @Override
    public String toString() {
            // TODO Auto-generated method stub
            return "i = " + i;
    }
}

class W extends Thread
{
        @Override
        public void run() {
                System.out.println("run begin");
                int i = 10 / 0;
                System.out.println("run end");
        }
}

class Y extends Thread
{
        Y()
        {
                start();
        }
        @Override
        public void run() {
                System.out.println("run begin");
                System.out.println("run end");
        }
}

public class M8 {
	 public static void main(String[] args) {
         HashMap map1 = new HashMap();
         map1.put("abc", 2314);
         map1.put(345, "rty");
         map1.put(3.4, true);
         map1.put('a', "xyz");
         Set entries = map1.entrySet();
         for(Object entry : entries) {
                 System.out.println(entry);
         } 
         
//         ArrayList list = new ArrayList();
//         list.add(90);
//         list.add(901);
//         list.add(910);
//         list.add(190);
//         list.add(0);
//         list.add(9);
//         System.out.println(list);
//         ListIterator it = list.listIterator();
//         
//         while(it.hasNext()) {
//                 System.out.print(it.next() + ", ");
//         }
//         System.out.println();
//         System.out.println("---------------");
//         while(it.hasPrevious()) {
//                 System.out.print(it.previous() + ", ");
//         }
//         System.out.println();
//         System.out.println(list);
         
         
//         ArrayList list = new ArrayList();
//         list.add(90);
//         list.add(901);
//         list.add(910);
//         list.add(190);
//         list.add(0);
//         list.add(9);
//         System.out.println(list);
//         ListIterator it = list.listIterator();
//         Object  obj;
//         while(it.hasNext()) {
//                 System.out.print(it.previousIndex() + ":");
//                 obj = it.next();
//                 System.out.print(obj + ":");
//                 System.out.print(it.nextIndex()+ ", ");
//         }
//         System.out.println();
//         System.out.println(list);
         
//         ArrayList list = new ArrayList();
//         list.add(new A(90));
//         list.add(new A(9));
//         list.add(new A(0));
//         list.add(new A(80));
//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);
//         
//         System.out.println(1);
//         W obj = new W();
//         obj.start();
//         System.out.println(2);
         
         System.out.println(1);
         Y obj = new Y();
         obj.start();
         System.out.println(2);
         
         
 }

}
