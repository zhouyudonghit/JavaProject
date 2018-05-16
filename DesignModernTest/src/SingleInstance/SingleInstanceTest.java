package SingleInstance;

/**
 * 懒汉式
 * @author localuser
 *
 */
public class SingleInstanceTest {
	private static SingleInstanceTest singleInstance;
	
	private SingleInstanceTest()
	{
		
		
	}
	
	//该方法线程安全，但是每次执行该方法都会同步，效率低
	public static synchronized SingleInstanceTest getInstance()
	{
		if(singleInstance == null)
		{
			singleInstance = new SingleInstanceTest();
		}
		return singleInstance;
	}
}
