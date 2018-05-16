package SingleInstance;

/**
 * ˫�ؼ�鷨���÷����ؼ���volatile�ؼ��֣�JDK1.5�����ϲ�û������
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
