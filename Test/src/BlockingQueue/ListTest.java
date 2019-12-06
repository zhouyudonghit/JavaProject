package BlockingQueue;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public void test1(List<List<Object>> list)
	{
		
	}

	public <E> void test2(List<E> list)
	{
		
	}
	
	public void test3(List<List> list)
	{
		
	}
	
	public <E> void test4(List<Object> list)
	{
		
	}
	
	public <E> void test5(List list)
	{
		list.add("");
	}
	
	public <E> void test6(ArrayList list)
	{
		
	}
	
	public void test7(List<?> list)
	{
		
	}
	
	public void test8()
	{
		List<Object> list = new ArrayList<>();
		Object obj = new Object();
		list.add(obj);
		obj = null;
		System.out.println(list.get(0));
	}
	
	public void test9()
	{
		List<String> list = null;
		for(String str:list)
		{
			
		}
	}
	
	public void test10()
	{
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add(new String("test1"));
		list1.add(new String("test2"));
		list1.add("test1");
		list1.add("test2");
		System.out.print("list1.size = "+list1.size());
		list2.add(new String("test1"));
		list1.removeAll(list2);
		System.out.print("list1.size = "+list1.size());
	}
	
	public void test11()
	{
		List<String> list1 = new ArrayList<>();
		String[] strs = list1.toArray(new String[list1.size()]);
		System.out.print(strs.length);
		strs = (String[]) new Object[] {};
	}
	
	public void testre(String[] objs)
	{
		System.out.print(objs.length);
	}
}
