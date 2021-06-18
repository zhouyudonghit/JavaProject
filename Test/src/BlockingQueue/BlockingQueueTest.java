package BlockingQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {
	private BlockingQueue<String> mBlockingQueue = new LinkedBlockingQueue();

	public void test() {
//		mBlockingQueue.add("1");
//		mBlockingQueue.add("2");
//		System.out.println("add 2");
//		mBlockingQueue.add("3");
//		System.out.println("add 3");
		
		List list = new ArrayList<>();
		list.add("");
		list.add(new Object());
		mBlockingQueue.put(e);
		System.out.println(list.toString());
	}

	public void vectorTest() {
		
		int count = 100;
		Vector list = new Vector<>();
		long start = System.nanoTime();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
					list.add(i);
				}
			}

		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
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
		long end = System.nanoTime();
		System.out.println("花费"+(end-start)+"纳秒");
	}

	public void arrayListTest() {
		int count = 100;
		List list = new ArrayList<>(2 * count);
		list.add(null);
		long start = System.nanoTime();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
					list.add(i);
				}
			}

		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
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
		long end = System.nanoTime();
		System.out.println("花费"+(end-start)+"纳秒");
	}

	public void synchronizedListTest() {
		int count = 100;
		List list = new ArrayList<>();
		List syncList = Collections.synchronizedList(list);
		syncList.iterator()
		long start = System.nanoTime();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
					//syncList.add(i,i);
					syncList.add(i);
				}
			}

		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < count; i++) {
					syncList.add(i);
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
		long end = System.nanoTime();
		System.out.println("花费"+(end-start)+"纳秒");
	}
	
	public void arrayListTest2()
	{
		List<String> list = new ArrayList<>();
		list.add(null);
		list.add("1");
		list.add("2");
		list.remove("4");
	}
	
	public List<BlockingQueueTest> getList()
	{
		return new ArrayList<>();
	}
	
	public void iteratorTest() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.iterator()
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Iterator it = list.listIterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.add("4");
			}
			
		}).start();
	}
}
