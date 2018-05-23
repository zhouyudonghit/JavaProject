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
		System.out.println("��1��װ����ǰ");    
		mSource.operation();    
        System.out.println("��1��װ������");    
	}

}
