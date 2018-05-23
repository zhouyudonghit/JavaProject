package StaticProxy;

public class ProxySubject implements Subject{
    private RealSubject subject;
    
    public ProxySubject(RealSubject subject)
    {
    	this.subject = subject;
    }
    
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		subject.visit();
	}

}
