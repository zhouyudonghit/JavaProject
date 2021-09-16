package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
	Runnable runnable;
	public void test()
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		Executors.newSingleThreadExecutor();
		es.shutdown();
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
		thread1.interrupt();
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
	
	public void test7()
	{
		Thread thread = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("begin sleep");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("end sleep");
						
						for(int i = 0;i < 100;i++)
						{
							System.out.println("i = "+i);
						}
					}
			
				});
		thread.start();
		thread.interrupt();
	}
	
	/**
	 * 测试Thread.interrupt方法
	 *无法中断
	 */
	public void testInterrupt1()
	{
		System.out.println("here1");
		try {
		    Thread.currentThread().interrupt();
		}catch(Exception e)
		{
			System.out.println("here3");
		}
		System.out.println("here2");
	}
	
	/**
	 * 中断处于阻塞状态的线程
	 */
	public void testInterrupt2()
	{
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("begin sleep");
					Thread.currentThread().sleep(5000);
			    } catch (InterruptedException ie) {        
			    	// 由于产生InterruptedException异常，线程终止！
			    	System.out.println("here1");
			    }
			}});
		thread.start();
		
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
	}
	
	public void testInterrupt3()
	{
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(!Thread.currentThread().isInterrupted())
				{
					System.out.println("here");
				}
				System.out.println("here1");
			}});
		thread.start();
		
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
		
		Thread.currentThread().stop();
	}
	
	public void testInterrupt4()
	{
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(!Thread.currentThread().isInterrupted())
				{
					System.out.println("here");
				}
				System.out.println("here1");
			}});
		thread.start();
		
		try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
		
		Thread.currentThread().stop();
	}
	
	private void test1()
	{
		
	}
}
