package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arratlist_Demo {

	public static void main(String[] args) {
		//ArrayList al new ArrayList();
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<String> al = new ArrayList<String>();
		
		List al = new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(12.54);
		al.add(true);
		
		//System.out.println(al); //[100, Welcome, 12.54, true]
		//System.out.println(al.size());
		al.remove(1); //index   [100, 12.54, true]
		al.remove("Welcome");   //element [100, 12.54, true, A]
		//System.out.println(al);
		al.add(2, "python");
		al.add('A');
		//System.out.println(al);  //[100, Welcome, python, 12.54, true]
		
		//System.out.println(al.get(3));
		al.set(2, "C#");
		//System.out.println("After replacing"+ al);
		
		//System.out.println(al.contains("C#"));//true
		//System.out.println(al.contains("C++")); //false
		
		//System.out.println(al.isEmpty());  //false
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		//System.out.println(al_dup);
		al_dup.removeAll(al); //[100, 12.54, C#, true, A]
		//System.out.println("After removing:"+al_dup); //[]
		
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
	}

}
