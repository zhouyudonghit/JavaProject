package SingleInstance;

/**
 * 双重检查法，该方法关键是volatile关键字，JDK1.5及以上才没有问题
 * @author localuser
 *
 */
public class SingleInstanceTest3 {
    private volatile static SingleInstanceTest3 singleInstance;
    
    private SingleInstanceTest3()
    {
    	
    }
    
    public static SingleInstanceTest3 getInstance()
    {
    	if(singleInstance == null)
    	{
    		synchronized(SingleInstanceTest3.class)
    		{
    			if(singleInstance == null)
    			{
    				singleInstance = new SingleInstanceTest3();
    			}
    		}
    	}
    	return singleInstance;
    }
}
