package BlockingQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

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
	
	public void test15()
	{
		Set<String> set = new HashSet<>();
		set.add("lily");
		set.add("tom");
		set.add("jerry");
		set.add("hanmei");
		set.add("lilei");
		Iterator<String> iterator = set.iterator();
		StringBuilder custNumsStr = new StringBuilder();
		while (iterator.hasNext())
        {
            custNumsStr.append(iterator.next());
            if(iterator.hasNext())
            {
            	custNumsStr.append(",");
            }
        }
		System.out.print(custNumsStr.toString());
	}
	
	public void test16()
	{
//		List<String> list = new ArrayList<>(2);
		//CopyOnWriteArrayList遍历的时候不会抛ConcurrentModificationException,它遍历的应该是一个副本，即使在遍历过程中操作了list，其遍历的还是原来的内容。
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
//		System.out.print(list.size());
		
//		for(String str : list)
//		{
//			list.remove("1");
//		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			list.remove("2");
//			break;
		}
		System.out.println(list);
	}
	
	public void test17()
	{
		BlockingQueue queue = new ArrayBlockingQueue(10);
		queue.add("test1");
		queue.add("test2");
		queue.add("test3");
		queue.add("test4");
		queue.add("test5");
		queue.add("test6");
		while(queue.size() != 0)
		{
			System.out.print(queue.poll());
		}
	}
}
