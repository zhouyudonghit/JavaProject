package SingleInstance;

/**
 * ����ʽ
 * @author localuser
 *
 */
public class SingleInstanceTest {
	private static SingleInstanceTest singleInstance;
	
	private SingleInstanceTest()
	{
		
		
	}
	
	//�÷����̰߳�ȫ������ÿ��ִ�и÷�������ͬ����Ч�ʵ�
	public static synchronized SingleInstanceTest getInstance()
	{
		if(singleInstance == null)
		{
			singleInstance = new SingleInstanceTest();
		}
		return singleInstance;
	}
}
