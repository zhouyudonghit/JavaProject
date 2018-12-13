import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import Date.DateTest;
import Extends.Son;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			if(it.next().equals("a"))
			{
				it.remove();
			}
		}
		
		System.out.println(list);
		
		long b = -1;
		int k = (int) b;
		System.out.println(k);
		
		int g = new Long(b).intValue();
		System.out.println(g);
		
		DateTest dateTest = new DateTest();
		dateTest.test2();
		
		int a = Son.i;
	}

}
