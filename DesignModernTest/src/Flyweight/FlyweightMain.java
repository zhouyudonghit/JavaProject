package Flyweight;

/**
 * 享元模式
 * Flyweight(享元)模式是如此的重要，因为它能帮你在一个复杂的系统中大量的节省内存空间。在JAVA语言中，String类型就是使用了享元模式。String对象是final类型，
 * 对象一旦创建就不可改变。在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。String a="abc"，其中"abc"就是一个字符串常量。
 * 核心总结，可以共享的对象，也就是说返回的同一类型的对象其实是同一实例，当客户端要求生成一个对象时，工厂会检测是否存在此对象的实例，如果存在那么直接返回此对象实例，
 * 如果不存在就创建一个并保存起来，这点有些单例模式的意思。通常工厂类会有一个集合类型的成员变量来用以保存对象，如hashtable,vector等。在java中，
 * 数据库连接池，线程池等即是用享元模式的应用。
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
