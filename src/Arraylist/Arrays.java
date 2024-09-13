package Arraylist;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList();
		a.add("bhuvana");
		a.add("welcome");
		a.add("to");
		a.add("genamplify");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println(a.size());
		for(String x:a)
		{
			System.out.println(x);
		}
		System.out.println(a.contains("bhuvana"));
		a.addAll(a);
		System.out.println(a);

	}

}
