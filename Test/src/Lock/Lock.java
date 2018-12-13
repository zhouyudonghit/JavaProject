package Lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Lock {
	private ReadWriteLock mReadWriteLock;
	public Lock()
	{
		mReadWriteLock = new ReentrantReadWriteLock(true);
	}
	public void test()
	{
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				mReadWriteLock.writeLock().lock();
				try {
					Thread.sleep(10000);
					System.out.println("here");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally
				{
					mReadWriteLock.writeLock().unlock();
				}
			}
			
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				mReadWriteLock.writeLock().lock();
				try {
					Thread.sleep(10000);
					System.out.println("here");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally
				{
					mReadWriteLock.writeLock().unlock();
				}
			}
			
		}).start();;
	}

}
