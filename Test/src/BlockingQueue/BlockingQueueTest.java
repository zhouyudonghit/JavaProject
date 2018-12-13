package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	private BlockingQueue<String> mBlockingQueue = new ArrayBlockingQueue(2);
	public void test()
	{
		mBlockingQueue.add("1");
	}
}
