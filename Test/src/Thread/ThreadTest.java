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
}
