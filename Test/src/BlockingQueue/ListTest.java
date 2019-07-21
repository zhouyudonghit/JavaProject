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
}
