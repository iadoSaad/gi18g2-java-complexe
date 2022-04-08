package aiac.gi18.java.complexe;

import java.util.Collections;

public class Main {
	
	public static void testListComplexe() {
		Complexe c1,c2,c3;
		c1=new Complexe(1, 2);
		c2=new Complexe(10,1);
		c3=new Complexe(3, 4);
		
		ListComplexe myList=new ListComplexe();
		
		myList.add(c1);myList.add(c2);myList.add(c3);
		
		System.out.println(myList);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		Collections.sort(myList, new ComparatorImg());
		
		System.out.println(myList);
		
	}

	public static void main(String[] args) {
		testListComplexe();
	}

}
