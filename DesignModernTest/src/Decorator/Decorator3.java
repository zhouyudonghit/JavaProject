package Decorator;

public class Decorator3 implements Sourceable{
private Sourceable mSource;
    
    public Decorator3(Sourceable sourceable)
    {
    	this.mSource = sourceable;
    }
    
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("��3��װ����ǰ");    
		mSource.operation();    
        System.out.println("��3��װ������");    
	}
	

}
