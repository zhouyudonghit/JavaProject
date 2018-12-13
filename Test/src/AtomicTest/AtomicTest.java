package AtomicTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    private AtomicInteger mai = new AtomicInteger(0);
    private int j = 0;
    
    int count = 10;
    public void test()
    {
    	Thread[] threads = new Thread[count];
       for(int i = 0;i < count;i++)
       {
    	   threads[i] = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				mai.incrementAndGet();
				j+=10;
			}
    	   });
    	   threads[i].start();
       }
       
       
       for(int i = 0;i < count;i++)
       {
    	   try {
			threads[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       
       System.out.println("j = "+j);
       System.out.println("mai = "+mai.get());
    }
}
