package Extends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import BlockingQueue.BlockingQueueTest;

public abstract class Father {
	
	public static int  i = 10;
	protected static Object data = new Object();
	protected int type = 0;
	
	public Father()
	{
		System.out.println("father constructer");
	}
	
	public Father(int a)
	{
		System.out.println("father constructer");
	}
	
	public void test()
	{
		System.out.println("father test()");
	}
	
	public int getType()
	{
		return type;
	}
	
	public List<BlockingQueueTest> getList()
	{
		return Collections.synchronizedList(new ArrayList<>());
	}
	
	public void test(Object obj)
	{
		
	}
}
