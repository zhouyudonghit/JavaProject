package Decorator;

/**
 * װ����ͨ����װһ��װ�ζ�������չ�书�ܣ����ֲ��ı���ӿڣ���ʵ�����ǻ��ڶ����������ģʽ��һ�ֱ��֡���������������ģʽ����ͬ�����¡�
       ��ͬ�㣺��ӵ��һ��Ŀ�����
       ��ͬ�㣺������ģʽ��Ҫʵ������һ���ӿڣ���װ����ģʽ����ʵ�ָö���Ľӿڡ�
 * @author localuser
 *
 */
public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sourceable source = new Source();		
        Sourceable obj = new Decorator1(new Decorator2(new Decorator3(source)));    
        obj.operation();  
	}

}
