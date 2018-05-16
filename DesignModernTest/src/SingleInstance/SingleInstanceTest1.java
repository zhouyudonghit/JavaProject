package SingleInstance;

/**
 * ¶öººÊ½
 * @author localuser
 *
 */
public class SingleInstanceTest1 {
	private static SingleInstanceTest1 singleInstance = new SingleInstanceTest1();
	
	private SingleInstanceTest1()
	{
		
	}
	
	public static synchronized SingleInstanceTest1 getInstance()
	{
		return singleInstance;
	}

}
