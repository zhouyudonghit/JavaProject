package Mediator;

public class Renter extends Person{

	public Renter(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void sendMessage(String msg) {
		// TODO Auto-generated method stub
		mediator.operation(this,msg);
	}

	@Override
	protected void getMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("求租者[" + name + "]收到中介发来的消息： " + msg);  
	}

}
