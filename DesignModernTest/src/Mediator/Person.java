package Mediator;

public abstract class Person{
    protected Mediator mediator;
    protected String name;
    
    public Person(String name,Mediator mediator)
    {
    	this.mediator = mediator;
    	this.name = name;
    }

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
    
    protected abstract void sendMessage(String msg);
    protected abstract void getMessage(String msg);
}
