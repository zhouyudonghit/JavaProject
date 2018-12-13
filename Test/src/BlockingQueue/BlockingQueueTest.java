package BlockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {
	private BlockingQueue<String> mBlockingQueue = new LinkedBlockingQueue();
	public void test()
	{
		mBlockingQueue.add("1");
		mBlockingQueue.add("2");
		System.out.println("add 2");
		mBlockingQueue.add("3");
		System.out.println("add 3");
	}
	
	public void vectorTest()
	{
		int count = 10000;
		Vector list = new Vector<>(2*count);
		Thread thread1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i = 0;i < count;i++)
						{
							list.add(i);
						}
					}
			
				});
		Thread thread2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i < count;i++)
				{
					list.add(i);
				}
			}
	
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
	
	public void arrayListTest()
	{
		int count = 10000;
		List list = new ArrayList<>(2*count);
		Thread thread1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i = 0;i < count;i++)
						{
							list.add(i);
						}
					}
			
				});
		Thread thread2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i < count;i++)
				{
					list.add(i);
				}
			}
	
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
}
