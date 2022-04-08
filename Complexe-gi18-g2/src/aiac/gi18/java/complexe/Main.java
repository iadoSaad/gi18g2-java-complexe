package aiac.gi18.java.complexe;

import java.util.Collections;
import java.util.Comparator;

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
		
		Comparator<Complexe> comp;
		comp=new Comparator<Complexe>() {

			@Override
			public int compare(Complexe o1, Complexe o2) {
				
				return -o1.compareTo(o2);
			}
			
		};
		Collections.sort(myList, comp);
		System.out.println(myList);
		
		comp=(o1, o2) -> -o1.compareTo(o2) ;
		Collections.sort(myList,comp);
		
		Collections.sort(myList, (o1, o2) -> -new ComparatorImg().compare(o1, o2));
		System.out.println(myList);
		
		myList.forEach(complexe -> System.out.println("* "+complexe));
		
	}

	public static void main(String[] args) {
		testListComplexe();
	}

}
