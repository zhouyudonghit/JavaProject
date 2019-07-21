package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
	Runnable runnable;
	public void test()
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		for(int i = 0;i < 2;i++)
		{
		es.submit(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("threadID = "+Thread.currentThread().getId());
			}
			
		});
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i < 2;i++)
		{
		es.submit(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("threadID = "+Thread.currentThread().getId());
			}
			
		});
		}
	}
	
	public void test2()
	{
		AtomicInteger integer = new AtomicInteger(5);
		integer.incrementAndGet();
		System.out.println(integer.get());
	}

	public void test3()
	{
		runnable = new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						runnable = null;
						System.out.println("haha");
					}
			
				};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	public void test4()
	{
		runnable = new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(true) {
							System.out.println("running");
						}
					}
			
				};
		Thread thread = new Thread(runnable);
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread.interrupt();
		System.out.println("after interrupt");
	}
	
	public void test5()
	{
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("here1");
			}
			
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("here2");
			}
			
		});
		
		thread1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("here3");
		
		thread2.start();
		
		try {
		thread1.join();
		thread2.join();
		}catch(Exception e)
		{
			
		}
		System.out.println("here4");
	}
	
	public void test6()
	{
		Thread thread = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("hello,hello");
					}
			
				});
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.start();
	}
}
