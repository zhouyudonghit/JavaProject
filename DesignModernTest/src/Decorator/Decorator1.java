package Decorator;

public class Decorator1 implements Sourceable{
    private Sourceable mSource;
    
    public Decorator1(Sourceable sourceable)
    {
    	this.mSource = sourceable;
    }
    
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("第1个装饰器前");    
		mSource.operation();    
        System.out.println("第1个装饰器后");    
	}

}
