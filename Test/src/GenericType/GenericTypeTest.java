package GenericType;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeTest {
	public void test1()
	{
		List<? extends Object> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list = list2;
		list2.add("2");
		List<Integer> list3 = new ArrayList<>();
		list3.add(4);
		List list4 = list3;
		list4.addAll(list2);
		
		ArrayList<String> list5 = new ArrayList<>();
		list5.add("5");
		list5 = (ArrayList<String>) list5.subList(0, 1);
		
		System.out.println(list4);
	}
	
	public <T> void test2(T t)
	{
		
	}
	
	public void test3()
	{
//		Father f = new Son();
//		f.door();
		
		Father f2 = new Father<String>() {
			public void test(String...stri)
			{
				//System.out.println(x);
			}
		};
		f2.door();
	}
	
	<T> T getObject()
	{
		String s = "1";
		return (T)s;
	}
}
