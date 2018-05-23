package Decorator;

public class Decorator2 implements Sourceable{

private Sourceable mSource;
    
    public Decorator2(Sourceable sourceable)
    {
    	this.mSource = sourceable;
    }
    
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("第2个装饰器前");    
		mSource.operation();    
        System.out.println("第2个装饰器后");    
	}
}
