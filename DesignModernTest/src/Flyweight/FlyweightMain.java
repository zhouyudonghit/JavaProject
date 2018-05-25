package Flyweight;

/**
 * ��Ԫģʽ
 * Flyweight(��Ԫ)ģʽ����˵���Ҫ����Ϊ���ܰ�����һ�����ӵ�ϵͳ�д����Ľ�ʡ�ڴ�ռ䡣��JAVA�����У�String���;���ʹ������Ԫģʽ��String������final���ͣ�
 * ����һ�������Ͳ��ɸı䡣��JAVA���ַ����������Ǵ��ڳ������еģ�JAVA��ȷ��һ���ַ��������ڳ�������ֻ��һ��������String a="abc"������"abc"����һ���ַ���������
 * �����ܽᣬ���Թ���Ķ���Ҳ����˵���ص�ͬһ���͵Ķ�����ʵ��ͬһʵ�������ͻ���Ҫ������һ������ʱ�����������Ƿ���ڴ˶����ʵ�������������ôֱ�ӷ��ش˶���ʵ����
 * ��������ھʹ���һ�������������������Щ����ģʽ����˼��ͨ�����������һ���������͵ĳ�Ա���������Ա��������hashtable,vector�ȡ���java�У�
 * ���ݿ����ӳأ��̳߳صȼ�������Ԫģʽ��Ӧ�á�
 * @author localuser
 *
 */
public class FlyweightMain {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1,fly2,fly3,fly4,fly5,fly6;

	public FlyweightMain()
	{
		fly1 = factory.getFlyWeight("Google");  
		fly2 = factory.getFlyWeight("Qutr");  
		fly3 = factory.getFlyWeight("Google");  
		fly4 = factory.getFlyWeight("Google");  
		fly5 = factory.getFlyWeight("Google");  
		fly6 = factory.getFlyWeight("Google"); 
	}
	
	public void showFlyweight(){  
		fly1.operation();  
		fly2.operation();  
		fly3.operation();  
		fly4.operation();  
		fly5.operation();  
		fly6.operation();  
		int objSize = factory.getFlyweightSize();  
		System.out.println("objSize = " + objSize);  
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightMain main = new FlyweightMain();
		main.showFlyweight();
	}

}
