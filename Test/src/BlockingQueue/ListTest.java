package BlockingQueue;

import java.util.ArrayList;
import java.util.Collections;
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
		list1.remove(null);
		list1.add(null);
		list1.add(null);
		String[] strs = list1.toArray(new String[list1.size()]);
		System.out.print(strs.length);
		strs = (String[]) new Object[] {};
	}
	
	public void testre(String[] objs)
	{
		
	}
	
	public void test12()
	{
		List<TestBean> list = new ArrayList<>();
		TestBean bean1 = new TestBean();
		bean1.number = 2;
		
		TestBean bean2 = new TestBean();
		bean2.number = 3;
		list.add(bean1);
		list.add(bean2);
		
		System.out.println(list);
		
		for(TestBean testBean : list)
		{
//			testBean.number = 5;
			testBean = new TestBean();
			testBean.number = 5;
		}
		
		System.out.println(list);
	}
	
	public void test13()
	{
		List<String> list = new ArrayList<>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.removeAll(list.subList(0, 2));
		System.out.print(list);
	}
	
	public void test14()
	{
		List list;
		List<Object> objList = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		strList.add("1");
		List<? extends Integer> list2 = strList;
		
		list = objList;
//		objList = (List<Object>)strList;
//		strList = (List<String>)objList;
//		list2 = strList;
//		strList = (List<String>) list2;
//		list = strList;
//		list.add(1);
//		System.out.print(strList);
		
		int a = list2.get(0);
		Object o = list2.get(0);
		String s = list2.get(0);
		List<? super Integer> list3 = new ArrayList<>();
		list3.add(1);
		String s = (String) list3.get(0);
	}
}
