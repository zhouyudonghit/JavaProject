package Date;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DateTest test = new DateTest();
        System.out.println(DateUtil.dateToString(new Date(), DateUtil.DATE_PATTERN_4));
//        test.test3();
//        test.test4();
//        System.out.println(Math.exp(-0));
//        System.out.print(TimeUnit.NANOSECONDS.toMillis(10000));
//        Object obj = new Object();
//        test(obj);
//        obj = null;
//        System.out.print("main thread,obj = "+obj);
        
	}
	
	public static void test(Object obj)
	{
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("sub thread,obj = "+obj);
			}
			
		}).start();
	}
}
