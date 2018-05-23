package Decorator;

/**
 * 装饰器通过包装一个装饰对象来扩展其功能，而又不改变其接口，这实际上是基于对象的适配器模式的一种变种。它与对象的适配器模式的异同点如下。
       相同点：都拥有一个目标对象。
       不同点：适配器模式需要实现另外一个接口，而装饰器模式必须实现该对象的接口。
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
